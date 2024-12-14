package com.example.model;

import androidx.annotation.NonNull;

public class SanPham {
    private String ma;
    private String ten;
    private int gia;
    private DanhMuc danhmuc;

    public SanPham() {
    }

    public SanPham(String ma, String ten, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @NonNull
    @Override
    public String toString() {
        return ma + "-" + ten + "-" + gia;
    }
}