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

    //�ο͵�¼
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

    //�ο�ע��
    @RequestMapping("/register")
    public String register(User user, Model model) throws Exception {
        User user1 = userService.getUser(user);
        if (null == user1) {
            userService.saveUser(user);
            model.addAttribute("error", "ע��ɹ�");
            return "../../register";
        } else {
            model.addAttribute("error", "���û��ѱ�ע��");
            return "../../register";
        }
    }

    //�����ο�������
    @RequestMapping("/return1")
    public String return1( Model model) throws Exception {
            return "main";
    }
}
