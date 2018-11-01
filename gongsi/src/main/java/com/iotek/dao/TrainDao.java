package com.iotek.dao;

import com.iotek.model.Train;

import java.util.List;

public interface TrainDao {
    Boolean saveTrain(Train train);
    Boolean  deleteTrain(Train train);
    Boolean  updateTrain(Train train);
    Train getTrain(Train train);
    List< Train> getTrain1(Train train);
    List< Train> getAllTrain();
}
