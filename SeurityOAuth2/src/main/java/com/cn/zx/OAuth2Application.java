package com.cn.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * Created by Administrator on 2016/12/9.
 */
@SpringBootApplication
@EnableOAuth2Client
public class OAuth2Application{
    public static void main(String[] args) {
        SpringApplication.run(OAuth2Application.class, args);
    }
}