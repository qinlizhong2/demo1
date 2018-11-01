package com.iotek.service;

import com.iotek.model.Train;

import java.util.List;

public interface TrainService {
    Boolean saveTrain(Train train);
    Boolean  deleteTrain(Train train);
    Boolean  updateTrain(Train train);
    Train getTrain(Train train);
    List< Train> getAllTrain();
    List< Train> getTrain1(Train train);
}
