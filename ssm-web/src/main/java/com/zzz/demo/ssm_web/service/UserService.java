package com.zzz.demo.ssm_web.service;

import com.zzz.demo.ssm_web.model.User;
import com.zzz.demo.ssm_web.pagemodel.UserPage;

/**
 * Created by zyn on 2016/6/23.
 */
public interface UserService {
    int add(UserPage page);

    int update(String id,UserPage page);

    int delete(String id);

    User getByid(String id);


    int saveUser(UserPage page);
}
