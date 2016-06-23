package com.zzz.demo.ssm_web.controller;

import com.zzz.demo.ssm_web.model.User;
import com.zzz.demo.ssm_web.pagemodel.UserPage;
import com.zzz.demo.ssm_web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by zyn on 2016/6/23.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView get(@RequestParam(value="id") String id) {
        User user = userService.getByid(id);
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String add(@ModelAttribute UserPage page) {
        return userService.add(page)+"";
    }

}
