/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class MauSac {

    /* 
    MaMau	varchar(7)		primary key,
	TenMau	nvarchar(20)	not null,
	TrangThai	bit			not null
     */
    private String maMau;
    private String tenMau;
    private boolean trangThai;

    public MauSac() {
    }

    public MauSac(String maMau, String tenMau, boolean trangThai) {
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

    public MauSac(String tenMau) {

        this.tenMau = tenMau;

    }

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    

}
