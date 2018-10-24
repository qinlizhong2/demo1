package com.iotek.service;

import com.iotek.model.Department;

import java.util.List;

public interface DepartmentService {
    Boolean saveDepartment(Department department);
    List<Department> getALLDepartment();
}
