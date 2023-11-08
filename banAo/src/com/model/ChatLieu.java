/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class ChatLieu {
    /* 	MaCL	varchar(7)		primary key,
	TenCL	nvarchar(20)	not null,
	TrangThai	bit			not null
    */
    
    private String maCL;
    private String tenCL; 
    private boolean trangThai;

    public ChatLieu() {
    }

    public ChatLieu(String maCL, String tenCL, boolean trangThai) {
        this.maCL = maCL;
        this.tenCL = tenCL;
        this.trangThai = trangThai;
    }
    public ChatLieu( String tenCL) {
        
        this.tenCL = tenCL;
        
    }

    public String getMaCL() {
        return maCL;
    }

    public void setMaCL(String maCL) {
        this.maCL = maCL;
    }

    public String getTenCL() {
        return tenCL;
    }

    public void setTenCL(String tenCL) {
        this.tenCL = tenCL;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
    
}
