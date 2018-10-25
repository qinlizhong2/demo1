package com.iotek.model;

import java.io.Serializable;

public class Resume  implements Serializable {
    private  Integer  r_id;
    private  String   r_name;
    private  String   r_sex;
    private  String   r_nation;
    private  String   r_birthday;
    private  String   r_phone;
    private  String   r_workyear;
    private  String   r_education;
    private  String   r_professinal;
    private  String   r_school;
    private  String   r_address;
    private  String   r_email;
    private  String   r_hobbies;
    private  Integer   r_state;
    private  String    r_target;
    private  Integer   r_uid;
    private  Integer   r_rid;
    private Integer   r_read;

    public Integer getR_read() {
        return r_read;
    }

    public void setR_read(Integer r_read) {
        this.r_read = r_read;
    }

    public Integer getR_rid() {
        return r_rid;
    }

    public void setR_rid(Integer r_rid) {
        this.r_rid = r_rid;
    }

    public String getR_target() {
        return r_target;
    }

    public void setR_target(String r_target) {
        this.r_target = r_target;
    }

    public Integer getR_uid() {
        return r_uid;
    }

    public void setR_uid(Integer r_uid) {
        this.r_uid = r_uid;
    }

    public Integer getR_state() {
        return r_state;
    }

    public void setR_state(Integer r_state) {
        this.r_state = r_state;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_sex() {
        return r_sex;
    }

    public void setR_sex(String r_sex) {
        this.r_sex = r_sex;
    }

    public String getR_nation() {
        return r_nation;
    }

    public void setR_nation(String r_nation) {
        this.r_nation = r_nation;
    }

    public String getR_birthday() {
        return r_birthday;
    }

    public void setR_birthday(String r_birthday) {
        this.r_birthday = r_birthday;
    }

    public String getR_phone() {
        return r_phone;
    }

    public void setR_phone(String r_phone) {
        this.r_phone = r_phone;
    }

    public String getR_workyear() {
        return r_workyear;
    }

    public void setR_workyear(String r_workyear) {
        this.r_workyear = r_workyear;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public String getR_professinal() {
        return r_professinal;
    }

    public void setR_professinal(String r_professinal) {
        this.r_professinal = r_professinal;
    }

    public String getR_school() {
        return r_school;
    }

    public void setR_school(String r_school) {
        this.r_school = r_school;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public String getR_email() {
        return r_email;
    }

    public void setR_email(String r_email) {
        this.r_email = r_email;
    }

    public String getR_hobbies() {
        return r_hobbies;
    }

    public void setR_hobbies(String r_hobbies) {
        this.r_hobbies = r_hobbies;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                ", r_sex='" + r_sex + '\'' +
                ", r_nation='" + r_nation + '\'' +
                ", r_birthday='" + r_birthday + '\'' +
                ", r_phone='" + r_phone + '\'' +
                ", r_workyear='" + r_workyear + '\'' +
                ", r_education='" + r_education + '\'' +
                ", r_professinal='" + r_professinal + '\'' +
                ", r_school='" + r_school + '\'' +
                ", r_address='" + r_address + '\'' +
                ", r_email='" + r_email + '\'' +
                ", r_hobbies='" + r_hobbies + '\'' +
                ", r_state=" + r_state +
                ", r_target='" + r_target + '\'' +
                ", r_uid=" + r_uid +
                '}';
    }
}
