package com.iotek.service;

import com.iotek.model.Salary;

public interface SalaryService {
    Boolean saveSalary(Salary salary);
    Boolean UpdateSalary(Salary salary);
    Salary getSalary(Salary salary);
    Salary getSalaryBYUID(Salary salary);
}
