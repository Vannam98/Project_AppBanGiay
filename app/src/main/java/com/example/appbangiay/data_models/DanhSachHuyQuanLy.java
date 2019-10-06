package com.example.appbangiay.data_models;

public class DanhSachHuyQuanLy {
    private String maDonHang;
    private String tenSanPham;
    private String soLuong;
    private String tenKhachHang;
    private String soDienThoaiKH;
    private String diaChiKH;
    private String tongTien;
    private String tinhTrang;
    private String lyDoHuy;

    public DanhSachHuyQuanLy(){

    }

    public DanhSachHuyQuanLy(String maDonHang, String tenSanPham, String soLuong, String tenKhachHang, String soDienThoaiKH, String diaChiKH, String tongTien, String tinhTrang, String lyDoHuy) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoaiKH = soDienThoaiKH;
        this.diaChiKH = diaChiKH;
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

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public void setSoDienThoaiKH(String soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
    }

    public String getDiaChiKH() {
        return diaChiKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
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
        return maDonHang + tenSanPham + soLuong + tenKhachHang + soDienThoaiKH + diaChiKH + tongTien + tinhTrang + lyDoHuy;
    }
}
