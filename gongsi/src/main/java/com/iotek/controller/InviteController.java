package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.EmployeeService;
import com.iotek.service.InviteService;
import com.iotek.service.RecruitService;
import com.iotek.service.ResumeService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
@Controller
public class InviteController {
    private final int PAGESIZE = 5;
    @Resource
    private InviteService inviteService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private RecruitService recruitService;
    @Resource
    private EmployeeService employeeService;


    //发起面试邀请
    @RequestMapping("/addinvite")
    public String addinvite(int reid, HttpSession session, Model model) throws Exception {
        Invite invite=new Invite();
        Resume resume=new Resume();
        resume.setR_id(reid);
        Resume resume1=resumeService.getResume(resume);
        invite.setI_uid(resume1.getR_uid());
        invite.setI_rid(resume1.getR_rid());
        invite.setI_reid(reid);
        invite.setI_pass(0);
        invite.setI_offer(0);
        inviteService.saveInvite(invite);
        return "sys";
    }

    //管理员查看已通过面试邀请
    @RequestMapping("/showInvite1")
    public String showInvite1( Model model) throws Exception {
        Invite invite=new Invite();
        invite.setI_pass(1);
        List<Invite> inviteList=inviteService.getAllInvite3(invite);
        if (inviteList.size() != 0) {
            model.addAttribute("inviteList", inviteList);
            return "sys";
        } else {
            return "sys";
        }
    }


    //游客查看面试邀请
    @RequestMapping("/showInvite")
    public String showInvite(int currentPage, Model model) throws Exception {
        int totalRows = inviteService.getAllInvite().size();
        int totalPages = DoPage.getTotalPages(totalRows);
        HashMap<String, Object> hashMap = new HashMap();
        hashMap.put("currentPage", (currentPage - 1) * PAGESIZE + 1);
        hashMap.put("PAGESIZE", PAGESIZE * currentPage);
        model.addAttribute("totalPages", totalPages);
        List<Invite> inviteList = inviteService.queryInviteByArray(hashMap);
        if (inviteList.size() != 0) {
            model.addAttribute("inviteList", inviteList);
            return "main";
        } else {
            return "main";
        }
    }

    //跳转面试详情页面
    @RequestMapping("/toInvite")
    public String toInvite(int id, Model model) throws Exception {
        Invite invite=new Invite();
        invite.setI_id(id);
        Invite invite1=inviteService.getAllInvite1(invite);
        model.addAttribute("invite1", invite1);
//        Resume resume=new Resume();
//        resume.setR_id(invite1.getI_reid());
//        Resume resume1=resumeService.getResume(resume);

        return "../../invite";
    }

    //接受面试并通过
    @RequestMapping("/passInvite")
    public String passInvite(int id, Model model) throws Exception {
        Invite invite=new Invite();
        invite.setI_id(id);
        Invite invite1=inviteService.getAllInvite1(invite);
        invite1.setI_pass(1);
        inviteService.updateInvite(invite1);
        return "main";
    }

    //管理员发送offer并且生成账号
    @RequestMapping("sendoffer")
    public String login(int id,Model model) throws Exception {
        Invite invite=new Invite();
        invite.setI_id(id);
        Invite invite1=inviteService.getAllInvite1(invite);
        Resume resume=new Resume();
        resume.setR_id(invite1.getI_reid());
        Resume resume1=resumeService.getResume(resume);
        Recruit recruit=new Recruit();
        recruit.setZ_id(invite1.getI_rid());
        Recruit recruit1=recruitService.getRecruit(recruit);
        Employee employee=new Employee();
        employee.setE_name(resume1.getR_name());
        employee.setE_job(recruit1.getZ_name());
        employee.setE_sal(recruit1.getZ_salary());
        employee.setE_sex(resume1.getR_sex());
        employee.setE_nation(resume1.getR_nation());
        employee.setE_birthday(resume1.getR_birthday());
        employee.setE_phone(resume1.getR_phone());
        employee.setE_education(resume1.getR_education());
        employee.setE_address(resume1.getR_address());
        employee.setE_email(resume1.getR_email());
        employee.setE_age(resume1.getR_age());
        employee.setE_identity(resume1.getR_phone());
        employee.setE_pass("123456");
        employee.setE_uid(invite1.getI_uid());
        employee.setE_state(0);
        employee.setE_pid(recruit1.getZ_pid());
        if(invite1.getI_offer()==0){
            invite1.setI_offer(1);
            inviteService.updateInvite(invite1);
            employeeService.saveEmployee(employee);
            model.addAttribute("msg","发送offer成功");
            return "sys";
        }else {
            model.addAttribute("msg","该用户已被录用");
            return "sys";
        }
    }


    //游客查看offer
    @RequestMapping("/showoffer")
    public String showoffer( HttpSession session,Model model) throws Exception {
        User user=(User)session.getAttribute("u1");
        int uid=user.getU_id();
        Employee employee=new Employee();
        employee.setE_uid(uid);
        Employee employee1=employeeService.getEmployee1(employee);
        Invite invite=new Invite();
        invite.setI_offer(1);
        invite.setI_uid(uid);
        Invite invite1=inviteService.getAllInvite4(invite);
        if (employee1!=null) {
            model.addAttribute("invite1", invite1);
            model.addAttribute("employee1", employee1);
            return "../../offer";
        } else {
            return "main";
        }

    }


}
