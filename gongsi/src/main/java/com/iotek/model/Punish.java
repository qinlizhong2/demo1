package com.iotek.model;

import java.util.Date;

public class Punish {
    private Integer pu_id;
    private Integer pu_shang;
    private Integer  pu_xia;
    private  Integer pu_eid;
    private  Date pu_now;

    public Integer getPu_id() {
        return pu_id;
    }

    public void setPu_id(Integer pu_id) {
        this.pu_id = pu_id;
    }

    public Integer getPu_shang() {
        return pu_shang;
    }

    public void setPu_shang(Integer pu_shang) {
        this.pu_shang = pu_shang;
    }

    public Integer getPu_xia() {
        return pu_xia;
    }

    public void setPu_xia(Integer pu_xia) {
        this.pu_xia = pu_xia;
    }

    public Integer getPu_eid() {
        return pu_eid;
    }

    public void setPu_eid(Integer pu_eid) {
        this.pu_eid = pu_eid;
    }

    public Date getPu_now() {
        return pu_now;
    }

    public void setPu_now(Date pu_now) {
        this.pu_now = pu_now;
    }

    @Override
    public String toString() {
        return "Punish{" +
                "pu_id=" + pu_id +
                ", pu_shang=" + pu_shang +
                ", pu_xia=" + pu_xia +
                ", pu_eid=" + pu_eid +
                ", pu_now=" + pu_now +
                '}';
    }
}
