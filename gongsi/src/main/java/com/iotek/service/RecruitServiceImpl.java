package com.iotek.service;

import com.iotek.dao.RecruitDao;
import com.iotek.model.Recruit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
@Service
public class RecruitServiceImpl implements  RecruitService {
    @Resource
    private RecruitDao recruitDao;

    public Recruit getRecruit(Recruit recruit) {
        return recruitDao.getRecruit(recruit);
    }

    public List<Recruit> getAllRecruit() {
        return recruitDao.getAllRecruit();
    }

    public List<Recruit> queryRecruitByArray(HashMap<String, Object> hashMap) {
        return recruitDao.queryRecruitByArray(hashMap);
    }

    public Boolean saveRecruit(Recruit recruit) {
        return recruitDao.saveRecruit(recruit);
    }

    public Boolean deleteRecruit(Recruit recruit) {
        return recruitDao.deleteRecruit(recruit);
    }
}
