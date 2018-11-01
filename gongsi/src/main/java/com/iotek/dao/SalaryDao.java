package com.iotek.dao;

import com.iotek.model.Salary;

public interface SalaryDao {
    Boolean saveSalary(Salary salary);
    Boolean UpdateSalary(Salary salary);
    Salary getSalary(Salary salary);
    Salary getSalaryBYUID(Salary salary);
}
