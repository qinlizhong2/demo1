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

    //ǰ�����ְλҳ��
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

    //����ְλ
    @RequestMapping("/savepos")
    public String savepos(Position position,Model model) throws Exception {
        List<Position> positionList=positionService.getALLPosition();
        if (positionList.size()!=0){
            for (int i = 0; i <positionList.size() ; i++) {
                if (position.getP_name().equals(positionList.get(i).getP_name())) {
                    model.addAttribute("msg", "��ְλ�Ѵ���");
                    return "../../addPosition";
                }
            }
            positionService.SavePostional(position);
            model.addAttribute("msg","��ӳɹ�");
        }else {
            positionService.SavePostional(position);
            model.addAttribute("msg","��ӳɹ�");
        }
        return "../../addPosition";
    }

    //�鿴ְλ��Ա��
    @RequestMapping("/showpos")
    public String showpos(Model model) throws Exception {
        List<Position> positionList=positionService.getALLPosition();
        List<Employee>employeeList=employeeService.getAllEmployee();
        model.addAttribute("positionList",positionList);
        model.addAttribute("employeeList",employeeList);
        return "../../showPos";
    }

    //����ְλ����
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

    //ɾ��ְλ
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
            model.addAttribute("msg","ɾ���ɹ�");
            return "sys";
        }else {
            model.addAttribute("msg","��ְλ����ְԱ���޷�ɾ��");
        }
            return "sys";
    }

    //ǰ������ְλҳ��
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

    //����ְλ
    @RequestMapping("/updatepos")
    public String updatepos(Position position,Model model) throws Exception {
        positionService.updatePostional(position);
        return "sys";
    }

}
