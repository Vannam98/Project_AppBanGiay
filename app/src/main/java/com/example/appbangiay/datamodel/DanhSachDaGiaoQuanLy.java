package com.example.appbangiay.datamodel;

public class DanhSachDaGiaoQuanLy {
    private String maDonHang;
    private String tenSanPham;
    private String tenKH;
    private String soDienThoaiKH;
    private String diaChiKH;
    private String nguoiGiao;
    private String soDienThoaiNguoiGiao;
    private String tongTien;
    public DanhSachDaGiaoQuanLy(){

    }

    public DanhSachDaGiaoQuanLy(String maDonHang, String tenSanPham, String tenKH, String soDienThoaiKH, String diaChiKH, String nuoiGiao, String soDienThoaiNguoiGiao, String tongTien) {
        this.maDonHang = maDonHang;
        this.tenSanPham = tenSanPham;
        this.tenKH = tenKH;
        this.soDienThoaiKH = soDienThoaiKH;
        this.diaChiKH = diaChiKH;
        this.nguoiGiao = nguoiGiao;
        this.soDienThoaiNguoiGiao = soDienThoaiNguoiGiao;
        this.tongTien = tongTien;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public String getTenSanPham() {
        return tenSanPham;
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

    public String getNguoiGiaoguoiGiao() {
        return nguoiGiao;
    }

    public String getSoDienThoaiNguoiGiao() {
        return soDienThoaiNguoiGiao;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
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

    public void setNguoiGiao(String nguoiGiao) {
        this.nguoiGiao = nguoiGiao;
    }

    public void setSoDienThoaiNguoiGiao(String soDienThoaiNguoiGiao) {
        this.soDienThoaiNguoiGiao = soDienThoaiNguoiGiao;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return maDonHang + tenSanPham + tenKH + soDienThoaiKH + diaChiKH + nguoiGiao + soDienThoaiNguoiGiao + tongTien;
    }
}
