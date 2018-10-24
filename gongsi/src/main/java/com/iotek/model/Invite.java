package com.iotek.model;

public class Invite {
    private Integer i_id;
    private Integer i_uid;
    private  Integer i_rid;
    private  Invite i_reid;
    private  Invite i_see;
    private  Invite i_pass;

    public Invite getI_reid() {
        return i_reid;
    }

    public void setI_reid(Invite i_reid) {
        this.i_reid = i_reid;
    }

    public Invite getI_see() {
        return i_see;
    }

    public void setI_see(Invite i_see) {
        this.i_see = i_see;
    }

    public Invite getI_pass() {
        return i_pass;
    }

    public void setI_pass(Invite i_pass) {
        this.i_pass = i_pass;
    }

    public Integer getI_id() {
        return i_id;
    }

    public void setI_id(Integer i_id) {
        this.i_id = i_id;
    }

    public Integer getI_uid() {
        return i_uid;
    }

    public void setI_uid(Integer i_uid) {
        this.i_uid = i_uid;
    }

    public Integer getI_rid() {
        return i_rid;
    }

    public void setI_rid(Integer i_rid) {
        this.i_rid = i_rid;
    }

    @Override
    public String toString() {
        return "Invite{" +
                "i_id=" + i_id +
                ", i_uid=" + i_uid +
                ", i_rid=" + i_rid +
                ", i_reid=" + i_reid +
                ", i_see=" + i_see +
                ", i_pass=" + i_pass +
                '}';
    }
}
