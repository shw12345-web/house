package com.yunzhu.house.portal.config.wx;

import com.github.wxpay.sdk.WXPayConfig;
import com.yunzhu.house.common.config.properties.WxPayXCXProperties;
import com.yunzhu.house.common.support.SpringContextKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyWxPayXCXConfig implements WXPayConfig {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    private WxPayXCXProperties wxProperties;

    private static MyWxPayXCXConfig myWxPayConfig;

    private byte[] certData;

    public static MyWxPayXCXConfig getInstance() {
        if (null == myWxPayConfig) {
            synchronized (MyWxPayXCXConfig.class) {
                if(null == myWxPayConfig) {
                    myWxPayConfig = new MyWxPayXCXConfig();
                }
            }
        }
        return myWxPayConfig;
    }

    private MyWxPayXCXConfig() {
        //String certPath = "/opt/docker/certs/wx/jsapi/apiclient_cert.p12";
        try {
            wxProperties = SpringContextKit.getBean(WxPayXCXProperties.class);
            File file = new File(wxProperties.getCertPath());
            InputStream certStream = new FileInputStream(file);
            this.certData = new byte[(int) file.length()];
            certStream.read(this.certData);
            certStream.close();
        }catch (Exception e){
            log.error("MyWxPayConfig init error:",e);
        }
    }

    @Override
    public String getAppID() {
        return wxProperties.getAppId();
    }

    @Override
    public String getMchID() {
        return wxProperties.getMchId();
    }

    @Override
    public String getKey() {
        return wxProperties.getPartnerKey();
    }

    public String getPartnerId(){
        return wxProperties.getPartnerId();
    }

    @Override
    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return 10000;
    }

}
