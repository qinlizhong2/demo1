package com.iotek.service;

import com.iotek.model.Punish;

public interface PunishService  {
    boolean savePunish(Punish punish);
    Punish getPunish(Punish punish);
    boolean updatePunish(Punish punish);
}
