package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.*;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class SystemController {

    @Resource
    private EmployeeService employeeService;
    @Resource
    private TrainService trainService;


    //返回游客主界面
    @RequestMapping("/return2")
    public String return2( Model model) throws Exception {
        return "sys";
    }

    //查看员工
    @RequestMapping("/return3")
    public String return3( Model model) throws Exception {
        return "sys";
    }

    //添加培训
    @RequestMapping("/addTrain")
    public String addTrain(Train train, Model model) throws Exception {
        trainService.saveTrain(train);
        return "sys";
    }

    //去添加培训界面
    @RequestMapping("/toaddTrain")
    public String toaddTrain( Model model) throws Exception {
        List<Employee>employeeList=employeeService.getAllEmployee();
        model.addAttribute("employeeList",employeeList);
        return "../../addTrain";
    }

    //查看培训
    @RequestMapping("/ShowTrain")
    public String ShowTrain( Model model) throws Exception {

        List<Train> trainList=trainService.getAllTrain();
        model.addAttribute("trainList",trainList);
        return "sys";
    }

    //删除培训
    @RequestMapping("/deleteTrain")
    public String deleteTrain(int id, Model model) throws Exception {
        Train train=new Train();
        train.setTr_id(id);
        Train train1=trainService.getTrain(train);
        trainService.deleteTrain(train1);
        return "sys";
    }

    //删除培训
    @RequestMapping("toupdateTrain")
    public String toupdateTrain(int id, Model model) throws Exception {
        Train train=new Train();
        train.setTr_id(id);
        Train train1=trainService.getTrain(train);
        model.addAttribute("train1",train1);
        return "../../UpdateTrain";
    }

    //修改培训
    @RequestMapping("updateTrain")
    public String updateTrain(Train train, Model model) throws Exception {
        trainService.updateTrain(train);
        return "sys";
    }


}
