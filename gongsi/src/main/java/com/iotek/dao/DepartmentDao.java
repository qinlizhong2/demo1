package com.iotek.dao;

import com.iotek.model.Department;

import java.util.List;

public interface DepartmentDao {
    Boolean saveDepartment(Department department);
    List<Department> getALLDepartment();
    Boolean deleteDepartment(Department department);

}
