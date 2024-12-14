package com.example.model;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class DanhMuc {
    private String ma;
    private String ten;
    private ArrayList<SanPham> sanPhams=new ArrayList<SanPham>();

    public DanhMuc() {
    }

    public DanhMuc(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    @NonNull
    @Override
    public String toString() {
        return ma+"-"+ten;
    }
}