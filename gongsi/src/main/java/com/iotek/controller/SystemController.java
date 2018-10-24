package com.iotek.controller;

import com.iotek.model.Department;
import com.iotek.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class SystemController {
    @Resource
    private DepartmentService departmentService;

    @RequestMapping("addDep")
    public String login(Model model, Department department) throws Exception {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");

        java.sql.Date date1=new java.sql.Date(dateFormat.parse(dateFormat.format(date)).getTime());
        department.setD_creattime(date1);
        List<Department>departmentList=departmentService.getALLDepartment();
        if (departmentList.size()!=0){
            for (int i = 0; i <departmentList.size() ; i++) {
                if (department.getD_name().equals(departmentList.get(i).getD_name())){
                    model.addAttribute("error","该部门已存在");
                    return "sys";
                }else {
                    departmentService.saveDepartment(department);
                    return "sys";
                }
            }
        }else {
            departmentService.saveDepartment(department);
        }
        return "sys";
    }

}
