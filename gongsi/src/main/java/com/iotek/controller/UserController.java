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
    @Resource
    private UserService userService;
    @Resource
    private RecruitService recruitService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private InviteService inviteService;

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

    private final int PAGESIZE = 5;

    @RequestMapping("/showRecruit")
    public String showRecruit(int currentPage, Model model) throws Exception {
        int totalRows = recruitService.getAllRecruit().size();
        int totalPages = DoPage.getTotalPages(totalRows);
        HashMap<String, Object> hashMap = new HashMap();
        hashMap.put("currentPage", (currentPage - 1) * PAGESIZE + 1);
        hashMap.put("PAGESIZE", PAGESIZE * currentPage);
        model.addAttribute("totalPages", totalPages);
        List<Recruit> recruitList = recruitService.queryRecruitByArray(hashMap);
        if (recruitList.size() != 0) {
            model.addAttribute("recruitList", recruitList);
            return "main";
        } else {
            return "main";
        }
    }
    @RequestMapping("/Showresume")
    public String Showresume(HttpSession session, Model model) throws Exception {
        User user=(User)session.getAttribute("u1");
        int uid=user.getU_id();
        Resume resume=new Resume();
        resume.setR_uid(uid);
        List<Resume> resumeList=resumeService.getALLResume1(resume);
        if (resumeList.size() != 0) {
            model.addAttribute("resumeList", resumeList);
            return "main";
        } else {
            return "main";
        }

    }


    @RequestMapping("/toupdateresume")
    public String toupdateresume( int id, Model model) throws Exception {
        Resume resume=new Resume();
        resume.setR_id(id);
        Resume resume1=resumeService.getResume(resume);
        model.addAttribute("resume1",resume1);
        return "../../updateResume";
    }

    @RequestMapping("/addresume")
    public String addresume(HttpSession session,Resume resume, Model model) throws Exception {
        User user=(User)session.getAttribute("u1");
        int uid=user.getU_id();
        resume.setR_state(0);
        resume.setR_uid(uid);
        resumeService.saveResume(resume);
        return "main";
    }

    @RequestMapping("/addinvite")
    public String addinvite(int id,HttpSession session,Model model) throws Exception {
        User user=(User)session.getAttribute("u1");
        int uid=user.getU_id();
        Invite invite=new Invite();
        invite.setI_uid(uid);
        invite.setI_rid(id);
        inviteService.saveInvite(invite);
        return "main";
    }

    @RequestMapping("/updateresume")
    public String updateresume(int id,Resume resume, Model model) throws Exception {
        //resume.setR_state(0);
        resume.setR_id(id);
        resumeService.updateResume(resume);
        return "main";
    }
}
