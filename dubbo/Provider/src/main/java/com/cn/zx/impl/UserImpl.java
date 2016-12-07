package com.cn.zx.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cn.zx.UserInterface;

import java.util.Random;

/**
 * Created by Administrator on 2016/12/7.
 */
@Service
public class UserImpl implements UserInterface{
    @Override
    public void sayHello(String s) {
        System.out.println("Hello "+ s);
    }

    @Override
    public int getAge() {
        return new Random().nextInt(100);
    }
}
