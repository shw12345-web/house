package com.yunzhu.house.portal.config.wx;

import com.github.wxpay.sdk.WXPayConfig;

import com.yunzhu.house.common.config.properties.WxPayProperties;
import com.yunzhu.house.common.support.SpringContextKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyWxPayConfig implements WXPayConfig {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    private WxPayProperties wxProperties;

    private static MyWxPayConfig myWxPayConfig;

    private byte[] certData;

    public static MyWxPayConfig getInstance() {
        if (null == myWxPayConfig) {
            synchronized (MyWxPayConfig.class) {
                if(null == myWxPayConfig) {
                    myWxPayConfig = new MyWxPayConfig();
                }
            }
        }
        return myWxPayConfig;
    }

    private MyWxPayConfig() {
        //String certPath = "/opt/docker/certs/wx/app/apiclient_cert.p12";
        try {
            wxProperties = SpringContextKit.getBean(WxPayProperties.class);
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
