package com.example.appbangiay.datamodel;

public class DanhSachDonHang {
    private String maSanPham;
    private String tenSanPham;
    private String soLuong;
    private String  size;
    private String  tongTien;
    public DanhSachDonHang(){

    }

    public DanhSachDonHang(String maSanPham, String tenSanPham, String soLuong, String size, String tongTien) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.size = size;
        this.tongTien = tongTien;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return  maSanPham + tenSanPham + soLuong + size + tongTien;
    }
}
