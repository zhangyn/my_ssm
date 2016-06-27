package com.zzz.demo.ssm_web.service.impl;

import com.zzz.demo.ssm_web.dao.UserMapper;
import com.zzz.demo.ssm_web.model.User;
import com.zzz.demo.ssm_web.pagemodel.UserPage;
import com.zzz.demo.ssm_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by zyn on 2016/6/23.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public int add(UserPage page) {
        User user = new User();
        user.setId("1");
        user.setName(page.getName());
        user.setAge(page.getAge());
        user.setCreatetime(new Date());
        try {
            userMapper.insert(user);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return 1;
    }

    public int update(String id, UserPage page) {
        User user = new User();
        user.setId(id);
        user.setName(page.getName());
        user.setAge(page.getAge());
        return userMapper.update(user);
    }

    public int delete(String id) {
        return userMapper.delete(id);
    }



    public User getByid(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int saveUser(UserPage page) {
        add(page);

        User user = new User();
        user.setId("2");
        user.setName(page.getName());
        user.setAge(page.getAge());
        user.setCreatetime(new Date());
        userMapper.insert(user);;
        return 0;
    }
}
