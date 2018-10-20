package com.iotek.controller;

import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("login")
    public String login( HttpSession session,Model model, User user) throws  Exception{
        User user1=userService.getUser(user);
        if (null!=user1){
            session.setAttribute("u",user1);
            return "main";
        }
        return "../../index";
    }
    @RequestMapping("/register")
    public String register(User user, Model model) throws Exception{
        User user1=userService.getUser(user);
        if (null==user1){
            model.addAttribute("error","注册成功");

            return "../../register";
        }else {
            model.addAttribute("error","该用户已被注册");
            return "../../register";
        }
    }
}
