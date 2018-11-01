package com.iotek.service;

import com.iotek.model.Attendance;

public interface AttendanceService {
    boolean saveAttendance(Attendance attendance);
    Attendance getAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
}
