package com.iotek.dao;

import com.iotek.model.Invite;
import com.iotek.model.Resume;

import java.util.HashMap;
import java.util.List;

public interface InviteDao {
    boolean saveInvite(Invite invite);
    List<Invite> getAllInvite();
    List<Invite> queryInviteByArray(HashMap<String,Object> hashMap);
    Invite getAllInvite1(Invite invite);
    List<Invite> getAllInvite2(Invite invite);
    boolean updateInvite(Invite invite);
}
