package com.example.appbangiay.data_models;

public class HoaDon_NhanVien {

    private String maDonHang;
    private String tenSanPham;
    private String mau;
    private String size;
    private String tenKhachHang;
    private String soDienThoaiKH;
    private String diaChiKH;
    private String tongTien;

    public HoaDon_NhanVien()
    {

    }

    public HoaDon_NhanVien(String maDonHang, String tenSanPham, String mau, String size, String tenKhachHang, String soDienThoaiKH, String diaChiKH, String tongTien) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.mau = mau;
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

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
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
        return maDonHang + tenSanPham + mau + size +
                tenKhachHang + soDienThoaiKH + diaChiKH + tongTien;
    }
}
