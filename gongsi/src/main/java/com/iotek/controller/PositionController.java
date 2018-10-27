package com.iotek.controller;


import com.iotek.model.Department;
import com.iotek.model.Employee;
import com.iotek.model.Position;
import com.iotek.service.DepartmentService;
import com.iotek.service.EmployeeService;
import com.iotek.service.PositionService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
public class PositionController {
    private final int PAGESIZE = 5;

    @Resource
    private PositionService positionService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private EmployeeService employeeService;

    //前往添加职位页面
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

    //保存职位
    @RequestMapping("/savepos")
    public String savepos(Position position,Model model) throws Exception {
        List<Position> positionList=positionService.getALLPosition();
        if (positionList.size()!=0){
            for (int i = 0; i <positionList.size() ; i++) {
                if (position.getP_name().equals(positionList.get(i).getP_name())) {
                    model.addAttribute("msg", "该职位已存在");
                    return "../../addPosition";
                }
            }
            positionService.SavePostional(position);
            model.addAttribute("msg","添加成功");
        }else {
            positionService.SavePostional(position);
            model.addAttribute("msg","添加成功");
        }
        return "../../addPosition";
    }

    //查看职位及员工
    @RequestMapping("/showpos")
    public String showpos(Model model) throws Exception {
        List<Position> positionList=positionService.getALLPosition();
        List<Employee>employeeList=employeeService.getAllEmployee();
        model.addAttribute("positionList",positionList);
        model.addAttribute("employeeList",employeeList);
        return "../../showPos";
    }

    //管理职位界面
    @RequestMapping("/showpos1")
    public String showpos1(int currentPage,Model model) throws Exception {
        int totalRows = positionService.getALLPosition().size();
        int totalPages = DoPage.getTotalPages(totalRows);
        HashMap<String, Object> hashMap = new HashMap();
        hashMap.put("currentPage", (currentPage - 1) * PAGESIZE + 1);
        hashMap.put("PAGESIZE", PAGESIZE * currentPage);
        model.addAttribute("totalPages", totalPages);
        List<Position> positionList=positionService.queryPositionByArray(hashMap);
        if(positionList.size()!=0){
            model.addAttribute("positionList",positionList);
            return "sys";
        }else {
            return "sys";
        }
    }

    //删除职位
    @RequestMapping("/deletepos")
    public String deletepos(int id,Model model) throws Exception {
        Position position=new Position();
        position.setP_id(id);
        Position position1=positionService.getPosition(position);
        Employee employee=new Employee();
        employee.setE_pid(id);
        List<Employee> employeeList=employeeService.getAllEmployeebypid(employee);
        if (employeeList.size()==0){
            positionService.deletePostional(position1);
            model.addAttribute("msg","删除成功");
            return "sys";
        }else {
            model.addAttribute("msg","该职位有在职员工无法删除");
        }
            return "sys";
    }

    //前往更改职位页面
    @RequestMapping("/toupdatepos")
    public String toupdatepos(int id,Model model) throws Exception {
        Position position=new Position();
        position.setP_id(id);
        Position position1=positionService.getPosition(position);
        List<Department> departmentList=departmentService.getALLDepartment();
        if (departmentList.size()!=0){
            model.addAttribute("position1",position1);
            model.addAttribute("departmentList",departmentList);
            return "../../updatepos";
        }else {
            return "sys";
        }
    }

    //更改职位
    @RequestMapping("/updatepos")
    public String updatepos(Position position,Model model) throws Exception {
        positionService.updatePostional(position);
        return "sys";
    }

}
