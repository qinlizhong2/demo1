package com.iotek.service;

import com.iotek.dao.EmployeeDao;
import com.iotek.model.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService {
    @Resource
    private EmployeeDao employeeDao;

    public Boolean saveEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    public Employee getEmployee(Employee employee) {
        return employeeDao.getEmployee(employee);
    }

    public Employee getEmployee1(Employee employee) {
        return employeeDao.getEmployee1(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    public List<Employee> getAllEmployeebypid(Employee employee) {
        return employeeDao.getAllEmployeebypid(employee);
    }
}
