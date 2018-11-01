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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class DepartmentController {
    private final int PAGESIZE = 5;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private EmployeeService employeeService;
    @Resource
    private PositionService positionService;

    //添加部门
    @RequestMapping("addDep")
    public String login(Model model, Department department) throws Exception {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");
        java.sql.Date date1=new java.sql.Date(dateFormat.parse(dateFormat.format(date)).getTime());
        department.setD_creattime(date1);
        List<Department> departmentList=departmentService.getALLDepartment();
        if (departmentList.size()!=0){
            for (int i = 0; i <departmentList.size() ; i++) {
                if (department.getD_name().equals(departmentList.get(i).getD_name())) {
                    model.addAttribute("error", "该部门已存在");
                    return "../../addDep";
                }
            }
            departmentService.saveDepartment(department);
            model.addAttribute("error", "保存成功");
        }
        else {
            departmentService.saveDepartment(department);
        }
        return "../../addDep";
    }

    //查看部门、职位及员工
    @RequestMapping("/showDep")
    public String showDep(Model model) throws Exception {
        List<Department> departmentList=departmentService.getALLDepartment();
        List<Position> positionList=positionService.getALLPosition();
        List<Employee>employeeList=employeeService.getAllEmployee();
        model.addAttribute("positionList",positionList);
        model.addAttribute("employeeList",employeeList);
        model.addAttribute("departmentList",departmentList);
        return "../../showDep";
    }

    //管理部门界面
    @RequestMapping("/showdep1")
    public String showdep1(int currentPage,Model model) throws Exception {
        int totalRows = departmentService.getALLDepartment().size();
        int totalPages = DoPage.getTotalPages(totalRows);
        HashMap<String, Object> hashMap = new HashMap();
        hashMap.put("currentPage", (currentPage - 1) * PAGESIZE + 1);
        hashMap.put("PAGESIZE", PAGESIZE * currentPage);
        model.addAttribute("totalPages", totalPages);
        List<Department> departmentList=departmentService.queryDepartmentByArray(hashMap);
        if(departmentList.size()!=0){
            model.addAttribute("departmentList",departmentList);
            return "sys";
        }else {
            return "sys";
        }
    }

    //删除部门
    @RequestMapping("/deletedep")
    public String deletedep(int id,Model model) throws Exception {
        Department department=new Department();
        department.setD_id(id);
        Department department1=departmentService.getDepartment(department);
        Position position=new Position();
        position.setP_did(department1.getD_id());
        List<Position> positionList=positionService.getPositionbydid(position);
        if (positionList.size()!=0) {
            Employee employee = new Employee();
            for (int i = 0; i < positionList.size(); i++) {
                employee.setE_pid(positionList.get(i).getP_id());
                List<Employee> employeeList1 = employeeService.getAllEmployeebypid(employee);
                if (employeeList1.size() != 0) {
                    model.addAttribute("msg", "该职位有在职员工无法删除");
                    return "sys";
                    }
                }
            for (int i = 0; i <positionList.size() ; i++) {
                positionService.deletePostional(positionList.get(i));
            }
            departmentService.deleteDepartment(department1);
            model.addAttribute("msg", "删除成功");
            return "sys";
        }else {
            departmentService.deleteDepartment(department1);
        }
        return "sys";
    }

}
