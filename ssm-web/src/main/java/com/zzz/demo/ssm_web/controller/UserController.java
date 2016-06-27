package com.zzz.demo.ssm_web.controller;

import com.zzz.demo.ssm_web.common.Result;
import com.zzz.demo.ssm_web.model.User;
import com.zzz.demo.ssm_web.pagemodel.UserPage;
import com.zzz.demo.ssm_web.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by zyn on 2016/6/23.
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Result get(@PathVariable("id") String id) {
        User user = userService.getByid(id);
        Result result = new Result();
        result.setCode(1);
        result.setResult(user);
        return result;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Result add(@ModelAttribute UserPage page) {
        int code = userService.add(page);
        Result result = new Result();
        result.setCode(code);
        return result;
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public Result testsave(@ModelAttribute UserPage page) {
        int code = userService.saveUser(page);
        Result result = new Result();
        result.setCode(code);
        return result;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id, @ModelAttribute UserPage page) {
        int code = userService.update(id, page);
        Result result = new Result();
        result.setCode(code);
        return result;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable("id") String id) {
        int code = userService.delete(id);
        Result result = new Result();
        result.setCode(code);
        return result;
    }



}
