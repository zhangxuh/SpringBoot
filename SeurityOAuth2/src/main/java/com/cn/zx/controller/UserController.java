package com.cn.zx.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2016/12/13.
 */
@Controller
public class UserController {
    public static Logger logger=Logger.getLogger(UserController.class.getName());
    @RequestMapping(value = "login")
    public String login(){
        logger.info("$$$$$$$$$$$$");
        Authentication auth = SecurityContextHolder.getContext()
                .getAuthentication();
        List<SimpleGrantedAuthority> auths=(List<SimpleGrantedAuthority>) auth.getAuthorities();
        //用户存在。验证码错误，返回登录页面，提示文字
        logger.info(">>>>>>>>>>>>>>"+auths.get(0).getAuthority());
       return "redirect:/";
    }
}
