package com.mindskip.xzs.configuration.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;


/**
 * @version 3.3.0
 * @description: The type System config.
 * Copyright (C), 2019-2024, 武汉思维跳跃科技有限公司
 * @date 2021 /5/26 10:45
 */

//这个类是系统配置类，主要是配置一些系统的属性，比如密码加密的密钥、安全忽略的url、微信、七牛云等配置。应该如何使用：
//1. 在application.yml中配置相关属性，比如：
//  system:
//    pwdKey:
//      key: 123456
//      salt: 123456
//    securityIgnoreUrls:
//      - /login
//      - /logout
//    wx:
//      appId: wx123456
//      appSecret: wx123456
//    qn:
//      accessKey: qn123456
//      secretKey: qn123456
//2. 在启动类上添加注解@EnableConfigurationProperties(SystemConfig.class)，原因是：
//  Spring Boot 2.0开始，默认情况下，如果我们在application.yml中配置了某个类，那么这个类就会被Spring Boot自动注入到Spring容器中，
//  我们只需要在启动类上添加注解@EnableConfigurationProperties(SystemConfig.class)即可。
//3. 在需要使用系统配置的地方注入SystemConfig类，比如：
//  @Autowired
//  private SystemConfig systemConfig;
//  public void test(){
//      String key = systemConfig.getPwdKey().getKey();
//      String salt = systemConfig.getPwdKey().getSalt();
//      List<String> securityIgnoreUrls = systemConfig.getSecurityIgnoreUrls();
//      String appId = systemConfig.getWx().getAppId();
//      String appSecret = systemConfig.getWx().getAppSecret();
//      String accessKey = systemConfig.getQn().getAccessKey();
//      String secretKey = systemConfig.getQn().getSecretKey();
//  }
@ConfigurationProperties(prefix = "system")
public class SystemConfig {

    private PasswordKeyConfig pwdKey;
    private List<String> securityIgnoreUrls;
    private WxConfig wx;
    private QnConfig qn;

    /**
     * Gets pwd key.
     *
     * @return the pwd key
     */
    public PasswordKeyConfig getPwdKey() {
        return pwdKey;
    }

    /**
     * Sets pwd key.
     *
     * @param pwdKey the pwd key
     */
    public void setPwdKey(PasswordKeyConfig pwdKey) {
        this.pwdKey = pwdKey;
    }

    /**
     * Gets security ignore urls.
     *
     * @return the security ignore urls
     */
    public List<String> getSecurityIgnoreUrls() {
        return securityIgnoreUrls;
    }

    /**
     * Sets security ignore urls.
     *
     * @param securityIgnoreUrls the security ignore urls
     */
    public void setSecurityIgnoreUrls(List<String> securityIgnoreUrls) {
        this.securityIgnoreUrls = securityIgnoreUrls;
    }

    /**
     * Gets wx.
     *
     * @return the wx
     */
    public WxConfig getWx() {
        return wx;
    }

    /**
     * Sets wx.
     *
     * @param wx the wx
     */
    public void setWx(WxConfig wx) {
        this.wx = wx;
    }

    /**
     * Gets qn.
     *
     * @return the qn
     */
    public QnConfig getQn() {
        return qn;
    }

    /**
     * Sets qn.
     *
     * @param qn the qn
     */
    public void setQn(QnConfig qn) {
        this.qn = qn;
    }

}
