package com.example.appbangiay.datamodel;

public class DangNhap {
    private String userName;
    private String password;

    public DangNhap(){

    }

    public DangNhap(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return userName + password;
    }
}
