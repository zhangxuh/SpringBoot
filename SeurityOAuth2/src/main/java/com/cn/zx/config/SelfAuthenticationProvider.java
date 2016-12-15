package com.cn.zx.config;

import com.alibaba.fastjson.JSONObject;
import com.cn.zx.model.Role;
import com.cn.zx.model.User;
import com.cn.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */
@Component
public class SelfAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private UserService userService;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 用户名
        String username = authentication.getName();
        // 验证码
        String password = (String) authentication.getCredentials();
        User user =userService.getUserInfo(username);
        System.out.println(username+"------------"+password);
        List<SimpleGrantedAuthority> auths = new ArrayList<SimpleGrantedAuthority>();
        if(user==null){
            //游客=》提示用户去注册
            //授权
            auths.add(new SimpleGrantedAuthority(Role.TOURIST.toString()));
            auths.add(new SimpleGrantedAuthority(username));
            auths.add(new SimpleGrantedAuthority(password));
            return new UsernamePasswordAuthenticationToken(null, null,
                    auths);
        }else{
            auths.add(new SimpleGrantedAuthority(user.getRole()));
        }
        return new UsernamePasswordAuthenticationToken(username, password,
                auths);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
