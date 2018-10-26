package com.iotek.service;

import com.iotek.dao.PostionalDao;
import com.iotek.model.Position;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PositionServiceImpl implements  PositionService{

    @Resource
    private PostionalDao postionalDao;
    public Boolean SavePostional(Position position) {
        return postionalDao.SavePostional(position);
    }
}
