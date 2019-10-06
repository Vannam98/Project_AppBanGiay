package com.example.appbangiay.data_models;

public class DanhSachHoanThanhNhanVien {
    private String maDonHang;
    private String tenSanPham;
    private String soLuong;
    private String size;
    private String mau;
    private String tenKH;
    private String soDienThoaiKH;
    private String diaChiKH;
    private String tongTien;
    private String tinhTrang;
    public DanhSachHoanThanhNhanVien(){

    }

    public DanhSachHoanThanhNhanVien(String maDonHang, String tenSanPham, String soLuong, String size, String mau, String tenKH, String soDienThoaiKH, String diaChiKH, String tongTien, String tinhTrang) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.size = size;
        this.mau = mau;
        this.tenKH = tenKH;
        this.soDienThoaiKH = soDienThoaiKH;
        this.diaChiKH = diaChiKH;
        this.tongTien = tongTien;
        this.tinhTrang = tinhTrang;
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

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    @Override
    public String toString() {
        return maDonHang + tenSanPham +soLuong +size +mau + tenKH + soDienThoaiKH + diaChiKH + tongTien + tinhTrang;
    }
}
