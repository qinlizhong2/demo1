package com.iotek.dao;

import com.iotek.model.Employee;

import java.util.List;

public interface EmployeeDao {
    Boolean saveEmployee(Employee employee);
    Employee getEmployee(Employee employee);
    Employee getEmployee1(Employee employee);
    List<Employee> getAllEmployee();
    List<Employee> getAllEmployeebypid(Employee employee);
}
