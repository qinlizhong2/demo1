package com.iotek.controller;

import com.iotek.model.Invite;
import com.iotek.model.Resume;
import com.iotek.service.InviteService;
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
        inviteService.saveInvite(invite);
        return "sys";
    }

    //管理员查看面试邀请
    @RequestMapping("/showInvite1")
    public String showInvite1(int currentPage, Model model) throws Exception {
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
}
