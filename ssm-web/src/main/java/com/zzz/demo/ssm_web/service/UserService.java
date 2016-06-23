package com.zzz.demo.ssm_web.service;

import com.zzz.demo.ssm_web.model.User;
import com.zzz.demo.ssm_web.pagemodel.UserPage;

/**
 * Created by zyn on 2016/6/23.
 */
public interface UserService {
    int add(UserPage page);

    User getByid(String id);
}
