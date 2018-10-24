package com.iotek.service;

import com.iotek.dao.InviteDao;
import com.iotek.model.Invite;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InviteServiceImpl implements  InviteService {

    @Resource
    private InviteDao inviteDao;
    public boolean saveInvite(Invite invite) {
        return inviteDao.saveInvite(invite);
    }
}
