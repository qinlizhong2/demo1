package com.iotek.dao;

import com.iotek.model.Punish;

public interface PunishDao {
    boolean savePunish(Punish punish);
    Punish getPunish(Punish punish);
    boolean updatePunish(Punish punish);
}
