package com.example.appbangiay.data_models;

public class ThanhToan {

    private String tenSanPham;
    private String size;
    private String soLuong;
    private String mau;
    private String hang;

    public ThanhToan()
    {

    }

    public ThanhToan(String tenSanPham, String size, String soLuong, String mau, String hang) {
        this.tenSanPham = tenSanPham;
        this.size = size;
        this.soLuong = soLuong;
        this.mau = mau;
        this.hang = hang;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
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

    @Override
    public String toString() {
        return tenSanPham + size + soLuong + mau + hang;
    }
}
