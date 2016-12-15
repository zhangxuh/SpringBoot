package com.cn.zx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

/**
 * Created by Administrator on 2016/12/9.
 */
//@Configuration
public class OAuth2Configuration extends AuthorizationServerConfigurerAdapter{
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory().withClient("client")
                .secret("secret")
                .authorizedGrantTypes("authorization_code").scopes("app");
    }
}
