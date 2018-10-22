package com.iotek.dao;

import com.iotek.model.Recruit;

import java.util.HashMap;
import java.util.List;

public interface RecruitDao {
    Recruit getRecruit(Recruit recruit);
    List<Recruit> getAllRecruit();
    List<Recruit> queryRecruitByArray(HashMap<String,Object> hashMap);
}
