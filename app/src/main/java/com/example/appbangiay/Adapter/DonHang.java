package com.example.appbangiay.Adapter;

public class DonHang {
    private String maDH;
    private String tenSP;
    private int soLuong;
    private int size;
    private String tenKH;
    private String soDT;
    private String diaChi;
    private String tongTien;

//    public DonHang()
//    {
//
//    }

    public DonHang(String maDH, String tenSP, int soLuong, int size, String tenKH, String soDT, String diaChi, String tongTien) {
        this.maDH = maDH;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.size = size;
        this.tenKH = tenKH;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.tongTien = tongTien;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }
//    public String toString()
//    {
//        return this.maDH+" "+this.tenSP+" "+this.soLuong+" "+this.size+" "+this.tenKH+" "+this.soDT+" "+this.diaChi+" "+this.tongTien;
//    }
}
