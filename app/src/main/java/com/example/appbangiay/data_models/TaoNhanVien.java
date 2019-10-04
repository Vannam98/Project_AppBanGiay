package com.example.appbangiay.data_models;

public class TaoNhanVien {

    private String hoTen;
    private String ngaySinh;
    private String soDienThoai;
    private String email;
    private String maNhanVien;
    private String password;
    private String confirmPassword;

    public TaoNhanVien()
    {

    }

    public TaoNhanVien(String hoTen, String ngaySinh, String soDienThoai, String email, String maNhanVien, String password, String confirmPassword) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.maNhanVien = maNhanVien;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return hoTen + ngaySinh + soDienThoai + email + maNhanVien + password + confirmPassword;
    }
}
