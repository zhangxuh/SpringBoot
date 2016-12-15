package com.cn.zx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2016/11/9.
 */
@RestController
public class HelloWordController {

    @RequestMapping("welcome")
    public String welcome(String name){
        return "Welcome "+name;
    }
    @RequestMapping("random")
    public int random() throws Exception{
        return new Random().nextInt(100);
    }
}
