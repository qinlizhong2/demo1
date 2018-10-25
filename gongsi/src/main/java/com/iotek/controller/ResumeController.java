package com.iotek.controller;

import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
public class ResumeController {
    private final int PAGESIZE = 5;
    @Resource
    private ResumeService resumeService;

    //根据游客ID查看简历
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

    //更改简历
    @RequestMapping("/updateresume")
    public String updateresume(int id,Resume resume, Model model) throws Exception {
        //resume.setR_state(0);
        resume.setR_id(id);
        resumeService.updateResume(resume);
        return "main";
    }

    //跳转更新简历界面
    @RequestMapping("/toupdateresume")
    public String toupdateresume( int id, Model model) throws Exception {
        Resume resume=new Resume();
        resume.setR_id(id);
        Resume resume1=resumeService.getResume(resume);
        model.addAttribute("resume1",resume1);
        return "../../updateResume";
    }

    //添加简历
    @RequestMapping("/addresume")
    public String addresume(HttpSession session,Resume resume, Model model) throws Exception {
        User user=(User)session.getAttribute("u1");
        int uid=user.getU_id();
        resume.setR_state(0);
        resume.setR_rid(0);
        resume.setR_read(0);
        resume.setR_uid(uid);
        resumeService.saveResume(resume);
        return "main";
    }

    //删除简历
    @RequestMapping("/deleteresume")
    public String deleteresume(HttpSession session, int id,Model model) throws Exception {
        Resume resume=new Resume();
        resume.setR_id(id);
        resumeService.deleteResume(resume);
        return "main";
    }

    //选中招聘信息后选择简历
    @RequestMapping("/Showresume1")
    public String Showresume1(int rid,HttpSession session, Model model) throws Exception {
        User user=(User)session.getAttribute("u1");
        int uid=user.getU_id();
        session.setAttribute("rid", rid);
        Resume resume=new Resume();
        resume.setR_uid(uid);
        List<Resume> resumeList1=resumeService.getALLResume1(resume);
        if (resumeList1.size() != 0) {
            model.addAttribute("resumeList1", resumeList1);
            return "main";
        } else {
            return "main";
        }

    }

    //投递简历
    @RequestMapping("/deliver")
    public String deliver(int id,HttpSession session, Model model) throws Exception {
        Resume resume1=new Resume();
        resume1.setR_id(id);
        Resume resume=resumeService.getResume(resume1);
        int rid=Integer.parseInt(session.getAttribute("rid").toString());
        if(resume.getR_state()==0){
            resume.setR_state(1);
            resume.setR_rid(rid);
            resumeService.updateResume(resume);
            model.addAttribute("msg", "投递成功");
            return "main";
        }else {
            model.addAttribute("msg", "该简历已投递请耐心等待结果");
        }
        return "main";
    }


    //管理员查看未读简历
    @RequestMapping("/showResume1")
    public String showResume1( Model model) throws Exception {
        Resume resume=new Resume();
        resume.setR_state(1);
        resume.setR_read(0);
        List<Resume> resumeList = resumeService.getALLResume2(resume);
        if (resumeList.size() != 0) {
            model.addAttribute("resumeList", resumeList);
            return "sys";
        } else {
            return "sys";
        }
    }

    //管理员查看未读简历
    @RequestMapping("/showResume2")
    public String showResume2( Model model) throws Exception {
        Resume resume=new Resume();
        resume.setR_state(1);
        resume.setR_read(1);
        List<Resume> resumeList1 = resumeService.getALLResume2(resume);
        if (resumeList1.size() != 0) {
            model.addAttribute("resumeList", resumeList1);
            return "sys";
        } else {
            return "sys";
        }
    }

    //跳转到简历详情界面
    @RequestMapping("/toSysresume")
    public String toSysresume(int reid, HttpSession session, Model model) throws Exception {
        Resume resume=new Resume();
        resume.setR_id(reid);
        Resume resume1=resumeService.getResume(resume);
        resume1.setR_read(1);
        resumeService.updateResume(resume1);
        model.addAttribute("resume1",resume1);
        return "../../SYSResume";
    }
}
