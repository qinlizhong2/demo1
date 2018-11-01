package com.iotek.model;

import java.util.Date;

public class Attendance {
    private Integer a_id;
    private Date  a_shang;
    private Date  a_xia;
    private  Integer a_eid;
    private  Date a_now;

    public Date getA_now() {
        return a_now;
    }

    public void setA_now(Date a_now) {
        this.a_now = a_now;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Date getA_shang() {
        return a_shang;
    }

    public void setA_shang(Date a_shang) {
        this.a_shang = a_shang;
    }

    public Date getA_xia() {
        return a_xia;
    }

    public void setA_xia(Date a_xia) {
        this.a_xia = a_xia;
    }

    public Integer getA_eid() {
        return a_eid;
    }

    public void setA_eid(Integer a_eid) {
        this.a_eid = a_eid;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "a_id=" + a_id +
                ", a_shang=" + a_shang +
                ", a_xia=" + a_xia +
                ", a_eid=" + a_eid +
                '}';
    }
}
