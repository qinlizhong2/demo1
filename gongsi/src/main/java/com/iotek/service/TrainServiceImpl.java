package com.iotek.service;

import com.iotek.dao.TrainDao;
import com.iotek.model.Train;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TrainServiceImpl implements  TrainService {

    @Resource
    private TrainDao trainDao;

    public Boolean saveTrain(Train train) {
        return trainDao.saveTrain(train);
    }

    public Boolean deleteTrain(Train train) {
        return trainDao.deleteTrain(train);
    }

    public Boolean updateTrain(Train train) {
        return trainDao.updateTrain(train);
    }

    public Train getTrain(Train train) {
        return trainDao.getTrain(train);
    }

    public List<Train> getAllTrain() {
        return trainDao.getAllTrain();
    }

    public List<Train> getTrain1(Train train) {
        return trainDao.getTrain1(train);
    }
}
