package com.zzz.demo.ssm_web.controller;

import com.zzz.demo.ssm_web.core.JsonResult;
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
    public JsonResult get(@PathVariable("id") String id) {
        User user = userService.getByid(id);
        JsonResult result = new JsonResult();
        result.setCode(1);
        result.setResult(user);
        return result;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public JsonResult add(@ModelAttribute UserPage page) {
        int code = userService.add(page);
        JsonResult result = new JsonResult();
        result.setCode(code);
        return result;
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public JsonResult testsave(@ModelAttribute UserPage page) {
        int code = userService.saveUser(page);
        JsonResult result = new JsonResult();
        result.setCode(code);
        return result;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public JsonResult update(@PathVariable("id") String id, @ModelAttribute UserPage page) {
        int code = userService.update(id, page);
        JsonResult result = new JsonResult();
        result.setCode(code);
        return result;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public JsonResult delete(@PathVariable("id") String id) {
        int code = userService.delete(id);
        JsonResult result = new JsonResult();
        result.setCode(code);
        return result;
    }


}
