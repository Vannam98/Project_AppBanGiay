package com.example.appbangiay.data_models;

public class DanhSachXacNhan_NhanVien {

    private String maDonHang;
    private String tenSanPham;
    private String soLuong;
    private String size;
    private String tenKhachHang;
    private String soDienThoaiKH;
    private String diaChiKH;
    private String tongTien;


    public DanhSachXacNhan_NhanVien()
    {

    }

    public DanhSachXacNhan_NhanVien(String maDonHang, String tenSanPham, String soLuong, String size, String tenKhachHang, String soDienThoaiKH, String diaChiKH, String tongTien) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.size = size;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoaiKH = soDienThoaiKH;
        this.diaChiKH = diaChiKH;
        this.tongTien = tongTien;
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

    @Override
    public String toString() {
        return maDonHang + tenSanPham + soLuong + size + tenKhachHang + soDienThoaiKH + diaChiKH + tongTien;
    }
}
