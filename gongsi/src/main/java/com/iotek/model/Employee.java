package com.iotek.model;

public class Employee {
    private  Integer  e_id;
    private  String e_name;
    private  String e_job;
    private  Integer e_sal;
    private  String  e_sex;
    private  String  e_nation;
    private  String  e_birthday;
    private  String  e_phone;
    private  String  e_education;
    private  String  e_address;
    private  String  e_email;
    private  Integer e_age;
    private  String  e_identity;
    private   String  e_pass;
    private  Integer e_uid;
    private  Integer e_pid;

    public Integer getE_pid() {
        return e_pid;
    }

    public void setE_pid(Integer e_pid) {
        this.e_pid = e_pid;
    }

    public Integer getE_uid() {
        return e_uid;
    }

    public void setE_uid(Integer e_uid) {
        this.e_uid = e_uid;
    }

    public String getE_identity() {
        return e_identity;
    }

    public void setE_identity(String e_identity) {
        this.e_identity = e_identity;
    }

    public String getE_pass() {
        return e_pass;
    }

    public void setE_pass(String e_pass) {
        this.e_pass = e_pass;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_job() {
        return e_job;
    }

    public void setE_job(String e_job) {
        this.e_job = e_job;
    }

    public Integer getE_sal() {
        return e_sal;
    }

    public void setE_sal(Integer e_sal) {
        this.e_sal = e_sal;
    }

    public String getE_sex() {
        return e_sex;
    }

    public void setE_sex(String e_sex) {
        this.e_sex = e_sex;
    }

    public String getE_nation() {
        return e_nation;
    }

    public void setE_nation(String e_nation) {
        this.e_nation = e_nation;
    }

    public String getE_birthday() {
        return e_birthday;
    }

    public void setE_birthday(String e_birthday) {
        this.e_birthday = e_birthday;
    }

    public String getE_phone() {
        return e_phone;
    }

    public void setE_phone(String e_phone) {
        this.e_phone = e_phone;
    }

    public String getE_education() {
        return e_education;
    }

    public void setE_education(String e_education) {
        this.e_education = e_education;
    }

    public String getE_address() {
        return e_address;
    }

    public void setE_address(String e_address) {
        this.e_address = e_address;
    }

    public String getE_email() {
        return e_email;
    }

    public void setE_email(String e_mail) {
        this.e_email = e_mail;
    }

    public Integer getE_age() {
        return e_age;
    }

    public void setE_age(Integer e_age) {
        this.e_age = e_age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", e_name='" + e_name + '\'' +
                ", e_job='" + e_job + '\'' +
                ", e_sal=" + e_sal +
                ", e_sex='" + e_sex + '\'' +
                ", e_nation='" + e_nation + '\'' +
                ", e_birthday='" + e_birthday + '\'' +
                ", e_phone=" + e_phone +
                ", e_education='" + e_education + '\'' +
                ", e_address='" + e_address + '\'' +
                ", e_email='" + e_email + '\'' +
                ", e_age=" + e_age +
                '}';
    }
}
