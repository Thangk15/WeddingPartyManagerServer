package com.thangn260302.qltc.DTO;

public class LoginRequest {
    private String userName;
    private String passWord;

    public String getUserName() { return userName; }
    public void setUsername(String userName) { this.userName = userName; }

    public String getPassWord() { return passWord; }
    public void setPassword(String passWord) { this.passWord = passWord; }
}