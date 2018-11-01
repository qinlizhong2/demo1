package com.iotek.model;

public class Salary {
    private Integer s_id;
    private Integer s_performance;
    private Integer s_overtime;
    private  Integer s_punish;
    private  Integer s_social;
    private  Integer s_final;
    private  Integer s_uid;

    public Integer getS_uid() {
        return s_uid;
    }

    public void setS_uid(Integer s_uid) {
        this.s_uid = s_uid;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public Integer getS_performance() {
        return s_performance;
    }

    public void setS_performance(Integer s_performance) {
        this.s_performance = s_performance;
    }

    public Integer getS_overtime() {
        return s_overtime;
    }

    public void setS_overtime(Integer s_overtime) {
        this.s_overtime = s_overtime;
    }

    public Integer getS_punish() {
        return s_punish;
    }

    public void setS_punish(Integer s_punish) {
        this.s_punish = s_punish;
    }

    public Integer getS_social() {
        return s_social;
    }

    public void setS_social(Integer s_social) {
        this.s_social = s_social;
    }

    public Integer getS_final() {
        return s_final;
    }

    public void setS_final(Integer s_final) {
        this.s_final = s_final;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "s_id=" + s_id +
                ", s_performance=" + s_performance +
                ", s_overtime=" + s_overtime +
                ", s_punish=" + s_punish +
                ", s_social=" + s_social +
                ", s_final=" + s_final +
                '}';
    }
}
