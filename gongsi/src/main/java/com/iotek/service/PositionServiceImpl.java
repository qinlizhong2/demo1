package com.iotek.service;

import com.iotek.dao.PostionalDao;
import com.iotek.model.Position;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class PositionServiceImpl implements  PositionService{

    @Resource
    private PostionalDao postionalDao;
    public Boolean SavePostional(Position position) {
        return postionalDao.SavePostional(position);
    }

    public List<Position> getALLPosition() {
        return postionalDao.getALLPosition();
    }

    public Boolean updatePostional(Position position) {
        return postionalDao.updatePostional(position);
    }

    public Boolean deletePostional(Position position) {
        return postionalDao.deletePostional(position);
    }

    public List<Position> queryPositionByArray(HashMap<String, Object> hashMap) {
        return postionalDao.queryPositionByArray(hashMap);
    }

    public Position getPosition(Position position) {
        return postionalDao.getPosition(position);
    }

    public List<Position> getPositionbydid(Position position) {
        return postionalDao.getPositionbydid(position);
    }
}
