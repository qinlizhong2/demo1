package com.iotek.utils;

/**
 * Created by Administrator on 2018/9/7 0007.
 */
public class DoPage {
    //�趨ÿҳ��ʾ��ҳ����
    private static final int PAGESIZE = 5;

    //�õ���ҳ��
    public static int getTotalPages(int totalRows){
        return totalRows%PAGESIZE==0?totalRows/PAGESIZE :totalRows/PAGESIZE +1;
    }
}
