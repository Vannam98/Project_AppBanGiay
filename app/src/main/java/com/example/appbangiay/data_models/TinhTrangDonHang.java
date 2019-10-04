package com.example.appbangiay.data_models;

public class TinhTrangDonHang {

    private String maDonHang;
    private String tenDonHang;
    private String thongTinDonHang;
    private String tinhTrangVanChuyen;
    private String tongTien;
    private String ngay;

    public TinhTrangDonHang()
    {

    }

    public TinhTrangDonHang(String maDonHang, String tenDonHang, String thongTinDonHang, String tinhTrangVanChuyen, String tongTien, String ngay) {
        this.maDonHang = maDonHang;
        this.tenDonHang = tenDonHang;
        this.thongTinDonHang = thongTinDonHang;
        this.tinhTrangVanChuyen = tinhTrangVanChuyen;
        this.tongTien = tongTien;
        this.ngay = ngay;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getTenDonHang() {
        return tenDonHang;
    }

    public void setTenDonHang(String tenDonHang) {
        this.tenDonHang = tenDonHang;
    }

    public String getThongTinDonHang() {
        return thongTinDonHang;
    }

    public void setThongTinDonHang(String thongTinDonHang) {
        this.thongTinDonHang = thongTinDonHang;
    }

    public String getTinhTrangVanChuyen() {
        return tinhTrangVanChuyen;
    }

    public void setTinhTrangVanChuyen(String tinhTrangVanChuyen) {
        this.tinhTrangVanChuyen = tinhTrangVanChuyen;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    @Override
    public String toString() {
        return maDonHang + tenDonHang + thongTinDonHang + tinhTrangVanChuyen + tongTien;
    }
}
