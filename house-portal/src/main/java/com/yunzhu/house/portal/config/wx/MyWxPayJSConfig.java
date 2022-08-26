package com.yunzhu.house.portal.config.wx;

import com.github.wxpay.sdk.WXPayConfig;
import com.yunzhu.house.common.config.properties.WxPayJSProperties;
import com.yunzhu.house.common.support.SpringContextKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyWxPayJSConfig implements WXPayConfig {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    private WxPayJSProperties wxProperties;

    private static MyWxPayJSConfig myWxPayConfig;

    private byte[] certData;

    public static MyWxPayJSConfig getInstance() {
        if (null == myWxPayConfig) {
            synchronized (MyWxPayJSConfig.class) {
                if(null == myWxPayConfig) {
                    myWxPayConfig = new MyWxPayJSConfig();
                }
            }
        }
        return myWxPayConfig;
    }

    private MyWxPayJSConfig() {
        //String certPath = "/opt/docker/certs/wx/jsapi/apiclient_cert.p12";
        try {
            wxProperties = SpringContextKit.getBean(WxPayJSProperties.class);
            File file = new File(wxProperties.getCertPath());
            InputStream certStream = new FileInputStream(file);
            this.certData = new byte[(int) file.length()];
            certStream.read(this.certData);
            certStream.close();
        }catch (Exception e){
            log.error("MyWxPayConfig init error:",e);
        }
    }

    public String getAppID() {
        return wxProperties.getAppId();
    }

    public String getMchID() {
        return wxProperties.getMchId();
    }

    public String getKey() {
        return wxProperties.getPartnerKey();
    }

    public String getPartnerId(){
        return wxProperties.getPartnerId();
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

}
