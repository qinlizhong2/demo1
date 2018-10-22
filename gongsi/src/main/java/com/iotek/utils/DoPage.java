package com.iotek.utils;

/**
 * Created by Administrator on 2018/9/7 0007.
 */
public class DoPage {
    //设定每页显示的页容量
    private static final int PAGESIZE = 5;

    //得到总页数
    public static int getTotalPages(int totalRows){
        return totalRows%PAGESIZE==0?totalRows/PAGESIZE :totalRows/PAGESIZE +1;
    }
}
