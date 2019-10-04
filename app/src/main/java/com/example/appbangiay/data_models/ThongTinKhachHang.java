package com.example.appbangiay.data_models;

public class ThongTinKhachHang {

    private String hoTen;
    private String ngaySinh;
    private String email;
    private String soDienThoaiKH;
    private String tenTaiKhoan;
    private String password;

    public ThongTinKhachHang()
    {

    }

    public ThongTinKhachHang(String hoTen, String ngaySinh, String email, String soDienThoaiKH, String tenTaiKhoan, String password) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.soDienThoaiKH = soDienThoaiKH;
        this.tenTaiKhoan = tenTaiKhoan;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public void setSoDienThoaiKH(String soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return hoTen + ngaySinh + email + soDienThoaiKH + tenTaiKhoan + password;
    }
}
