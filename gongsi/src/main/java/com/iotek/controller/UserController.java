package com.iotek.controller;

import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(Model model, User user) throws  Exception{
        User user1=userService.getUser(user);
        if (null!=user1){
            model.addAttribute("user",user1);
            return "main";
        }
        return "../../index";
    }
}
