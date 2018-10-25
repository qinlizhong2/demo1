package com.iotek.service;

import com.iotek.dao.InviteDao;
import com.iotek.model.Invite;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class InviteServiceImpl implements  InviteService {

    @Resource
    private InviteDao inviteDao;
    public boolean saveInvite(Invite invite) {
        return inviteDao.saveInvite(invite);
    }

    public List<Invite> getAllInvite() {
        return inviteDao.getAllInvite();
    }

    public List<Invite> queryInviteByArray(HashMap<String, Object> hashMap) {
        return inviteDao.queryInviteByArray(hashMap);
    }

    public List<Invite> getAllInvite2(Invite invite) {
        return inviteDao.getAllInvite2(invite);
    }

    public Invite getAllInvite1(Invite invite) {
        return inviteDao.getAllInvite1(invite);
    }

    public boolean updateInvite(Invite invite) {
        return inviteDao.updateInvite(invite);
    }
}
