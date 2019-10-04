package com.example.appbangiay.data_models;

public class DanhSachVanChuyen_QuanLy {

    private String maDonHang;
    private String tenSanPham;
    private String soLuong;
    private String tenKhachHang;
    private String soDienThoaiKH;
    private String diaChiKH;
    private String nguoiGiao;
    private String soDTNguoiGiao;
    private String tongTien;
    private String tinhTrang;

    public DanhSachVanChuyen_QuanLy()
    {

    }


    public DanhSachVanChuyen_QuanLy(String maDonHang, String tenSanPham, String soLuong, String tenKhachHang, String soDienThoaiKH, String diaChiKH, String nguoiGiao, String soDTNguoiGiao, String tongTien, String tinhTrang) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoaiKH = soDienThoaiKH;
        this.diaChiKH = diaChiKH;
        this.nguoiGiao = nguoiGiao;
        this.soDTNguoiGiao = soDTNguoiGiao;
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

    public String getNguoiGiao() {
        return nguoiGiao;
    }

    public void setNguoiGiao(String nguoiGiao) {
        this.nguoiGiao = nguoiGiao;
    }

    public String getSoDTNguoiGiao() {
        return soDTNguoiGiao;
    }

    public void setSoDTNguoiGiao(String soDTNguoiGiao) {
        this.soDTNguoiGiao = soDTNguoiGiao;
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
        return maDonHang + tenSanPham + soLuong + tenKhachHang + soDienThoaiKH + diaChiKH +  nguoiGiao
                +  soDTNguoiGiao +  tongTien + tinhTrang;
    }
}
