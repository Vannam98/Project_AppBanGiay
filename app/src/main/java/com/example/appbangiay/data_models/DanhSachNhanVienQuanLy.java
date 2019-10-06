package com.example.appbangiay.data_models;

public class DanhSachNhanVienQuanLy {
    private String maNV;
    private String tenNV;
    private String soDienThoaiNV;
    private String diaChiNV;
    private String email;
    private String chucVu;

    public DanhSachNhanVienQuanLy(){

    }

    public DanhSachNhanVienQuanLy(String maNV, String tenNV, String soDienThoaiNV, String diaChiNV, String email, String chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.soDienThoaiNV = soDienThoaiNV;
        this.diaChiNV = diaChiNV;
        this.email = email;
        this.chucVu = chucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getSoDienThoaiNV() {
        return soDienThoaiNV;
    }

    public String getDiaChiNV() {
        return diaChiNV;
    }

    public String getEmail() {
        return email;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setSoDienThoaiNV(String soDienThoaiNV) {
        this.soDienThoaiNV = soDienThoaiNV;
    }

    public void setDiaChiNV(String diaChiNV) {
        this.diaChiNV = diaChiNV;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
