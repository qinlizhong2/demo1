package com.iotek.model;

public class Position {
    private Integer p_id;
    private String  p_name;
    private  Integer p_did;

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Integer getP_did() {
        return p_did;
    }

    public void setP_did(Integer p_did) {
        this.p_did = p_did;
    }

    @Override
    public String toString() {
        return "Position{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", p_did=" + p_did +
                '}';
    }
}
