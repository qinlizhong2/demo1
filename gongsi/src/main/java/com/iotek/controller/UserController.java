package com.iotek.controller;

import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 11929 on 2018/10/18.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(@ModelAttribute("user") User user)throws Exception{
        User user1 = userService.getUser(user);
        if (null!=user1){
            return "main";
        }
        return "../../index";
    }
}
