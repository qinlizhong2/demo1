package com.iotek.controller;

import com.iotek.model.Invite;
import com.iotek.model.Recruit;
import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.InviteService;
import com.iotek.service.RecruitService;
import com.iotek.service.ResumeService;
import com.iotek.service.UserService;
import com.iotek.utils.DoPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {
    private final int PAGESIZE = 5;
    @Resource
    private UserService userService;
    @Resource
    private InviteService inviteService;

    //游客登录
    @RequestMapping("login")
    public String login(HttpSession session, Model model, User user) throws Exception {
        User user1 = userService.getUser(user);
        if (null != user1) {
            if (user1.getU_id()==22){
                return "sys";
            }else {
                session.setAttribute("u1", user1);
                model.addAttribute("u",user1);
                return "main";
            }
        }
        return "../../index";
    }

    //游客注册
    @RequestMapping("/register")
    public String register(User user, Model model) throws Exception {
        User user1 = userService.getUser(user);
        if (null == user1) {
            userService.saveUser(user);
            model.addAttribute("error", "注册成功");
            return "../../register";
        } else {
            model.addAttribute("error", "该用户已被注册");
            return "../../register";
        }
    }

    //返回游客主界面
    @RequestMapping("/return1")
    public String return1( Model model) throws Exception {
            return "main";
    }
}
