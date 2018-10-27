package com.iotek.service;

import com.iotek.dao.DepartmentDao;
import com.iotek.model.Department;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Resource
    private DepartmentDao departmentDao;

    public Boolean saveDepartment(Department department) {

        return departmentDao.saveDepartment(department);
    }

    public List<Department> getALLDepartment() {
        return departmentDao.getALLDepartment();
    }

    public Boolean deleteDepartment(Department department) {
        return departmentDao.deleteDepartment(department);
    }

    public Boolean updateDepartment(Department department) {
        return departmentDao.updateDepartment(department);
    }

    public List<Department> queryDepartmentByArray(HashMap<String, Object> hashMap) {
        return departmentDao.queryDepartmentByArray(hashMap);
    }

    public Department getDepartment(Department department) {
        return departmentDao.getDepartment(department);
    }
}
