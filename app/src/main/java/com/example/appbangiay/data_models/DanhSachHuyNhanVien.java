package com.example.appbangiay.data_models;

public class DanhSachHuyNhanVien {
    private String maDonHang;
    private String tenSanPham;
    private String soLuong;
    private String size;
    private String tongTien;
    private String tinhTrang;
    private String lyDoHuy;
    public DanhSachHuyNhanVien(){

    }

    public DanhSachHuyNhanVien(String maDonHang, String tenSanPham, String soLuong, String size, String tongTien, String tinhTrang, String lyDoHuy) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.size = size;
        this.tongTien = tongTien;
        this.tinhTrang = tinhTrang;
        this.lyDoHuy = lyDoHuy;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
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

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getLyDoHuy() {
        return lyDoHuy;
    }

    public void setLyDoHuy(String lyDoHuy) {
        this.lyDoHuy = lyDoHuy;
    }

    @Override
    public String toString() {
        return maDonHang + tenSanPham + soLuong + size + tongTien + tinhTrang + lyDoHuy;
    }
}
