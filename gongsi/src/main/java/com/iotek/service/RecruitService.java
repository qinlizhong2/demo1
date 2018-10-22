package com.iotek.service;

import com.iotek.model.Recruit;

import java.util.HashMap;
import java.util.List;

public interface RecruitService {
    Recruit getRecruit(Recruit recruit);
    List<Recruit> getAllRecruit();
    List<Recruit> queryRecruitByArray(HashMap<String,Object> hashMap);
}
