package com.example.appbangiay.data_models;

public class DanhSachSanPhamQuanLy {
    private int maSanpham;
    private String tenSanPham;
    private String mau;
    private String hang;
    private  int giaTien;
    private int size;
    private int soLuong;

    public DanhSachSanPhamQuanLy(int maSanpham, String tenSanPham, String mau, String hang, int giaTien, int size, int soLuong) {
        this.maSanpham = maSanpham;
        this.tenSanPham = tenSanPham;
        this.mau = mau;
        this.hang = hang;
        this.giaTien = giaTien;
        this.size = size;
        this.soLuong = soLuong;
    }

    public int getMaSanpham() {
        return maSanpham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getMau() {
        return mau;
    }

    public String getHang() {
        return hang;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public int getSize() {
        return size;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaSanpham(int maSanpham) {
        this.maSanpham = maSanpham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
