package com.zzz.demo.ssm_web.dao;

import com.zzz.demo.ssm_web.model.User;

/**
 * Created by zyn on 2016/6/23.
 */
public interface UserMapper {

    User selectByPrimaryKey(String id);

    int insert(User user);
}
