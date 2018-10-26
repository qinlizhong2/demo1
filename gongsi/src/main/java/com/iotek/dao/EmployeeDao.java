package com.iotek.dao;

import com.iotek.model.Employee;

public interface EmployeeDao {
    Boolean saveEmployee(Employee employee);
    Employee getEmployee(Employee employee);
    Employee getEmployee1(Employee employee);
}
