package com.iotek.model;

import java.util.Date;

public class Train {
    private Integer tr_id;
    private String   tr_topic;
    private  String  tr_content;
    private  String  tr_object;
    private String tr_starttime;
    private String  tr_endtime;
    private  String tr_place;

    public Integer getTr_id() {
        return tr_id;
    }

    public void setTr_id(Integer tr_id) {
        this.tr_id = tr_id;
    }

    public String getTr_topic() {
        return tr_topic;
    }

    public void setTr_topic(String tr_topic) {
        this.tr_topic = tr_topic;
    }

    public String getTr_content() {
        return tr_content;
    }

    public void setTr_content(String tr_content) {
        this.tr_content = tr_content;
    }

    public String getTr_object() {
        return tr_object;
    }

    public void setTr_object(String tr_object) {
        this.tr_object = tr_object;
    }

    public String getTr_starttime() {
        return tr_starttime;
    }

    public void setTr_starttime(String tr_starttime) {
        this.tr_starttime = tr_starttime;
    }

    public String getTr_endtime() {
        return tr_endtime;
    }

    public void setTr_endtime(String tr_endtime) {
        this.tr_endtime = tr_endtime;
    }

    public String getTr_place() {
        return tr_place;
    }

    public void setTr_place(String tr_place) {
        this.tr_place = tr_place;
    }

    @Override
    public String toString() {
        return "Train{" +
                "tr_id=" + tr_id +
                ", tr_topic='" + tr_topic + '\'' +
                ", tr_content='" + tr_content + '\'' +
                ", tr_object='" + tr_object + '\'' +
                ", tr_starttime=" + tr_starttime +
                ", tr_endtime=" + tr_endtime +
                ", tr_place='" + tr_place + '\'' +
                '}';
    }
}
