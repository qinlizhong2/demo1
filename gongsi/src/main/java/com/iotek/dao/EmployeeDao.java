package com.iotek.dao;

import com.iotek.model.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee getEmployee2(Employee employee);
    Boolean saveEmployee(Employee employee);
    Employee getEmployee(Employee employee);
    Employee getEmployee1(Employee employee);
    List<Employee> getAllEmployee();

    List<Employee> getAllEmployeebystate(Employee employee);
    List<Employee> getAllEmployeebypid(Employee employee);
    Boolean updateEmployee(Employee employee);
}
