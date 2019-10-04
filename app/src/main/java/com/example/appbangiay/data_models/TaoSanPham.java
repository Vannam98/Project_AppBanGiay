package com.example.appbangiay.data_models;

public class TaoSanPham {

    private String maSanPham;
    private String tenSanPham;
    private String soLuong;
    private String size;
    private String mau;
    private String hang;
    private String gia;
    private String chiTiet;

    public TaoSanPham()
    {

    }

    public TaoSanPham(String maSanPham, String tenSanPham, String soLuong, String size, String mau, String hang, String gia, String chiTiet) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.size = size;
        this.mau = mau;
        this.hang = hang;
        this.gia = gia;
        this.chiTiet = chiTiet;
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

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    @Override
    public String toString() {
        return maSanPham + tenSanPham + soLuong + size + mau + hang + gia + chiTiet;
    }
}
