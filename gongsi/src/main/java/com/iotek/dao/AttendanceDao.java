package com.iotek.dao;

import com.iotek.model.Attendance;

public interface AttendanceDao {
    boolean saveAttendance(Attendance attendance);
    Attendance getAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
}
