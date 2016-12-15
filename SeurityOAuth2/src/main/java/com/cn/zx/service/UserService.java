package com.cn.zx.service;

import com.cn.zx.model.Role;
import com.cn.zx.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/14.
 */
@Service
public class UserService {
    public User getUserInfo(String username){
        User user=null;
        if("zhangsan".equals(username)){
            user=new User();
            user.setUsername(username);
            user.setPassword("123");
            user.setRole(Role.USER.toString());
        }else if("zhaosi".equals(username)){
            user=new User();
            user.setUsername(username);
            user.setPassword("123");
            user.setRole(Role.ADMIN.toString());
        }
        return user;
    }
}
