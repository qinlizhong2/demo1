package com.iotek.dao;

import com.iotek.model.Position;

import java.util.HashMap;
import java.util.List;

public interface PostionalDao {
    Boolean SavePostional(Position position);
    List<Position> getALLPosition();
    Position getPosition(Position position);
    Boolean updatePostional(Position position);
    Boolean deletePostional(Position position);
    List<Position> queryPositionByArray(HashMap<String,Object> hashMap);
}
