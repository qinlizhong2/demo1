package com.iotek.service;

import com.iotek.dao.DepartmentDao;
import com.iotek.model.Department;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
}
