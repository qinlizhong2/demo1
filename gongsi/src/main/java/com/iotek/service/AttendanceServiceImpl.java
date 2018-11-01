package com.iotek.service;

import com.iotek.dao.AttendanceDao;
import com.iotek.model.Attendance;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AttendanceServiceImpl  implements  AttendanceService{
    @Resource
    private AttendanceDao attendanceDao;



    public boolean saveAttendance(Attendance attendance) {
        return attendanceDao.saveAttendance(attendance);
    }

    public Attendance getAttendance(Attendance attendance) {
        return attendanceDao.getAttendance(attendance);
    }

    public boolean updateAttendance(Attendance attendance) {
        return attendanceDao.updateAttendance(attendance);
    }
}
