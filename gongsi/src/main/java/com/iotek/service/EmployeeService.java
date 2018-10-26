package com.iotek.service;

import com.iotek.model.Employee;

public interface EmployeeService {
    Boolean saveEmployee(Employee employee);
    Employee getEmployee(Employee employee);
    Employee getEmployee1(Employee employee);
}
