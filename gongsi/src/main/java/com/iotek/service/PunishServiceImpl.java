package com.iotek.service;

import com.iotek.dao.PunishDao;
import com.iotek.model.Punish;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PunishServiceImpl implements PunishService {

    @Resource
    private PunishDao punishDao;


    public boolean savePunish(Punish punish) {
        return punishDao.savePunish(punish);
    }

    public Punish getPunish(Punish punish) {
        return punishDao.getPunish(punish);
    }

    public boolean updatePunish(Punish punish) {
        return punishDao.updatePunish(punish);
    }
}
