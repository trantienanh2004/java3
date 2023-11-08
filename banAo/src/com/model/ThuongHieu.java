/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class ThuongHieu {

    /* 	MaTH	varchar(7)		primary key,
	TenTH	nvarchar(20)	not null,
	TrangThai	bit			not null
     */
    private String maTH;
    private String tenTH;
    private boolean trangThai;

    public ThuongHieu() {
    }

    public ThuongHieu(String maTH, String tenTH, boolean trangThai) {
        this.maTH = maTH;
        this.tenTH = tenTH;
        this.trangThai = trangThai;
    }

    public ThuongHieu(String maTH) {
        this.maTH = maTH;

    }

    public String getMaTH() {
        return maTH;
    }

    public void setMaTH(String maTH) {
        this.maTH = maTH;
    }

    public String getTenTH() {
        return tenTH;
    }

    public void setTenTH(String tenTH) {
        this.tenTH = tenTH;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
