package com.iotek.service;

import com.iotek.model.Position;

import java.util.HashMap;
import java.util.List;

public interface PositionService {
    Boolean SavePostional(Position position);
    List<Position> getALLPosition();
    Boolean updatePostional(Position position);
    Boolean deletePostional(Position position);
    List<Position> queryPositionByArray(HashMap<String,Object> hashMap);
    Position getPosition(Position position);
    List<Position> getPositionbydid(Position position);
}
