package com.iotek.model;


import java.util.Date;

public class Department {
    private Integer d_id;
    private String  d_name;
    private Date d_creattime;

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Date getD_creattime() {
        return d_creattime;
    }

    public void setD_creattime(Date d_creattime) {
        this.d_creattime = d_creattime;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_creattime='" + d_creattime + '\'' +
                '}';
    }
}
