package com.iotek.service;

import com.iotek.model.Department;

import java.util.HashMap;
import java.util.List;

public interface DepartmentService {
    Boolean saveDepartment(Department department);
    List<Department> getALLDepartment();
    Boolean deleteDepartment(Department department);
    Boolean updateDepartment(Department department);
    List<Department> queryDepartmentByArray(HashMap<String,Object> hashMap);
    Department getDepartment(Department department);
}
