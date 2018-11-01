package com.iotek.controller;

import com.iotek.model.Attendance;
import com.iotek.model.Employee;
import com.iotek.model.Punish;
import com.iotek.model.Train;
import com.iotek.service.AttendanceService;
import com.iotek.service.EmployeeService;
import com.iotek.service.PunishService;
import com.iotek.service.TrainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;
    @Resource
    private AttendanceService attendanceService;
    @Resource
    private PunishService punishService;
    @Resource
    private TrainService trainService;


    //返回游客主界面
    @RequestMapping("/return5")
    public String return5( Model model) throws Exception {
        return "emp";
    }

    //登录
    @RequestMapping("/emplogin")
    public String emplogin(HttpSession session, Employee employee, Model model) throws Exception {
        Employee employee1=employeeService.getEmployee2(employee);
        if (employee1!=null){
            session.setAttribute("e1", employee1);
            return "emp";
        }else {
            return "../../login";
        }
    }


    //查看个人信息
    @RequestMapping("/showemp")
    public String showemp(HttpSession session, Model model) throws Exception {
        Employee employee=(Employee) session.getAttribute("e1");
        model.addAttribute("employee",employee);
            return "../../updateEmp";
        }

    //查看个人信息
    @RequestMapping("/showallemp")
    public String showallemp(HttpSession session, Model model) throws Exception {
        List<Employee> employeeList2=employeeService.getAllEmployee();
        model.addAttribute("employeeList2",employeeList2);
        return "emp";
    }

    //查看自己培训
    @RequestMapping("/showemptrain")
    public String showemptrain(HttpSession session, Model model) throws Exception {
        Employee employee=(Employee) session.getAttribute("e1");
        Train train=new Train();
        train.setTr_object(employee.getE_name());
        List<Train> trainList=trainService.getTrain1(train);
        model.addAttribute("trainList",trainList);
        return "emp";
    }


    //更改个人信息
    @RequestMapping("/updateemp")
    public String updateemp(HttpSession session,Employee employee, Model model) throws Exception {
        employeeService.updateEmployee(employee);
        model.addAttribute("msg","修改成功");
        return "../../updateEmp";
    }

    //打卡
    @RequestMapping("/addatten")
    public String addatten(HttpSession session, Model model) throws Exception {
        Date date = new Date();



        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);


        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :HH:mm:ss");
        java.sql.Timestamp date1=new java.sql.Timestamp(dateFormat.parse(dateFormat.format(date)).getTime());

        java.sql.Date date2=new java.sql.Date(dateFormat.parse(dateFormat.format(date)).getTime());
        Employee employee=(Employee)session.getAttribute("e1");


        Attendance attendance=new Attendance();
        attendance.setA_now(date2);
        attendance.setA_eid(employee.getE_id());
        Attendance attendance1=attendanceService.getAttendance(attendance);



        Punish punish=new Punish();
        punish.setPu_eid(employee.getE_id());
        punish.setPu_now(date2);




        if (attendance1==null){
            attendance.setA_eid(employee.getE_id());
            attendance.setA_shang(date1);
            attendanceService.saveAttendance(attendance);


            Long time=attendance.getA_shang().getTime()-calendar.getTimeInMillis();


            if (time/(1000* 60 * 60)>12){
                punish.setPu_shang(2);
                punishService.savePunish(punish);
            }else if (time/(1000* 60 * 60)<12&&time/(1000* 60 * 60)>9){
                punish.setPu_shang(1);
                punishService.savePunish(punish);
            }else {
                punish.setPu_shang(0);
                punishService.savePunish(punish);
            }
            return "emp";
        }else {
           attendance1.setA_xia(date1);
           attendanceService.updateAttendance(attendance1);
            Long time1=attendance1.getA_xia().getTime()-calendar.getTimeInMillis();
           Punish punish1=punishService.getPunish(punish);
           if (time1/(1000* 60 * 60)<15){
               punish1.setPu_xia(2);
               punishService.updatePunish(punish1);
           }
           else if (time1/(1000* 60 * 60)>15&&(time1/(1000* 60 * 60)<18)){
               punish1.setPu_xia(1);
               punishService.updatePunish(punish1);
           }
           else if (time1/(1000* 60 * 60)>18&&(time1/(1000* 60 * 60)<20)){
               punish1.setPu_xia(0);
               punishService.updatePunish(punish1);
           }else {
               punish1.setPu_xia(3);
               punishService.updatePunish(punish1);
           }
        }
        return "emp";
    }
}



