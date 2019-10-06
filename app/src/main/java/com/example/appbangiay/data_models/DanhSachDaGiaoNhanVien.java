package com.example.appbangiay.data_models;

public class DanhSachDaGiaoNhanVien {
    private String maDonHang;
    private String tenSanPham;
    private String soLuong;
    private String tenKH;
    private String soDienThoaiKH;
    private String diaChiKH;
    private String tongTien;
    private String tinhTrang;
    public DanhSachDaGiaoNhanVien(){

    }

    public DanhSachDaGiaoNhanVien(String maDonHang, String tenSanPham, String soLuong, String tenKH, String soDienThoaiKH, String diaChiKH, String tongTien, String tinhTrang) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.tenKH = tenKH;
        this.soDienThoaiKH = soDienThoaiKH;
        this.diaChiKH = diaChiKH;
        this.tongTien = tongTien;
        this.tinhTrang = tinhTrang;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getSoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public String getDiaChiKH() {
        return diaChiKH;
    }

    public String getTongTien() {
        return tongTien;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setSoDienThoaiKH(String soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return maDonHang + tenSanPham + soLuong + tenKH + soDienThoaiKH + diaChiKH + tongTien + tinhTrang;
    }
}
