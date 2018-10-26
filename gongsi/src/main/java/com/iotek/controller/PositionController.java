package com.iotek.controller;


import com.iotek.model.Department;
import com.iotek.service.DepartmentService;
import com.iotek.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PositionController {

    @Resource
    private PositionService positionService;
    @Resource
    private DepartmentService departmentService;

    //前往添加部门页面
    @RequestMapping("/toaddpos")
    public String toaddpos(Model model) throws Exception {
       List<Department> departmentList=departmentService.getALLDepartment();
       if (departmentList.size()!=0){
           model.addAttribute("departmentList",departmentList);
            return "../../addPosition";
        }else {
            return "sys";
       }
    }
}
