package com.cn.zx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/12/7.
 */
@RestController
public class ConsumerController {
    @Autowired
    private UserInterface userInterface;
    @RequestMapping("/say")
    public void sayHello(String s){
        userInterface.sayHello(s);
    }
    @RequestMapping("/age")
    public int getAge(){
        return  userInterface.getAge();
    }
}
