package com.iotek.service;

import com.iotek.model.Invite;

import java.util.HashMap;
import java.util.List;

public interface InviteService {
    boolean saveInvite(Invite invite);
    List<Invite> getAllInvite();
    List<Invite> queryInviteByArray(HashMap<String,Object> hashMap);
    List<Invite> getAllInvite2(Invite invite);
    Invite getAllInvite1(Invite invite);
    boolean updateInvite(Invite invite);
    List<Invite> getAllInvite3(Invite invite);
    Invite getAllInvite4(Invite invite);
}
