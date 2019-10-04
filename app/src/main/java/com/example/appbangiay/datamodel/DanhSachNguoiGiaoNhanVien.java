package com.example.appbangiay.datamodel;

public class DanhSachNguoiGiaoNhanVien {

    private String nguoiGiao;
    private String soDTNguoiGiao;
    private String tinhTrang;

    public DanhSachNguoiGiaoNhanVien(){

    }

    public DanhSachNguoiGiaoNhanVien(String nguoiGiao, String soDTNguoiGiao, String tinhTrang) {
        this.nguoiGiao = nguoiGiao;
        this.soDTNguoiGiao = soDTNguoiGiao;
        this.tinhTrang = tinhTrang;
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

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return nguoiGiao + soDTNguoiGiao + tinhTrang;
    }
}
