/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class Size {
    /* MaSize	varchar(7)		primary key,
	GiaTri	varchar(5)		not null,
	TrangThai	bit			not null
    */
    private String maSize;
    private String giaTri;
    private boolean trangThai;

    public Size() {
    }

    public Size(String maSize, String giaTri, boolean trangThai) {
        this.maSize = maSize;
        this.giaTri = giaTri;
        this.trangThai = trangThai;
    }
    public Size(String giaTri) {
        this.giaTri = giaTri;
    }

    public String getMaSize() {
        return maSize;
    }

    public void setMaSize(String maSize) {
        this.maSize = maSize;
    }

    public String getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(String giaTri) {
        this.giaTri = giaTri;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
