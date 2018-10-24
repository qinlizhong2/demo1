package com.iotek.model;

import java.io.Serializable;

public class Recruit implements Serializable {
    private Integer z_id;
    private String  z_name;
    private  String z_education;
    private  int z_salary;
    private  int z_year;
    private  int z_pid;

    public int getZ_pid() {
        return z_pid;
    }

    public void setZ_pid(int z_pid) {
        this.z_pid = z_pid;
    }

    public Recruit() {
    }

    public Integer getZ_id() {
        return z_id;
    }

    public void setZ_id(Integer z_id) {
        this.z_id = z_id;
    }

    public String getZ_name() {
        return z_name;
    }

    public void setZ_name(String z_name) {
        this.z_name = z_name;
    }

    public String getZ_education() {
        return z_education;
    }

    public void setZ_education(String z_education) {
        this.z_education = z_education;
    }

    public int getZ_salary() {
        return z_salary;
    }

    public void setZ_salary(int z_salary) {
        this.z_salary = z_salary;
    }

    public int getZ_year() {
        return z_year;
    }

    public void setZ_year(int z_year) {
        this.z_year = z_year;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "z_id=" + z_id +
                ", z_name='" + z_name + '\'' +
                ", z_education='" + z_education + '\'' +
                ", z_salary=" + z_salary +
                ", z_year=" + z_year +
                ", z_pid=" + z_pid +
                '}';
    }
}
