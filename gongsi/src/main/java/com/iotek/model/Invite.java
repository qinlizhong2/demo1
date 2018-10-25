package com.iotek.model;

public class Invite {
    private Integer i_id;
    private Integer i_uid;
    private  Integer i_rid;
    private  Integer i_reid;

    private  Integer i_pass;

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

    public Integer getI_reid() {
        return i_reid;
    }

    public void setI_reid(Integer i_reid) {
        this.i_reid = i_reid;
    }


    public Integer getI_pass() {
        return i_pass;
    }

    public void setI_pass(Integer i_pass) {
        this.i_pass = i_pass;
    }

    @Override
    public String toString() {
        return "Invite{" +
                "i_id=" + i_id +
                ", i_uid=" + i_uid +
                ", i_rid=" + i_rid +
                ", i_reid=" + i_reid +
                ", i_pass=" + i_pass +
                '}';
    }
}
