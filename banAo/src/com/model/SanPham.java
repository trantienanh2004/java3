/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.util.Date;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class SanPham {

    private int idSP;
    private String maSP;
    private String ten;
    private Date ngayTao;
    private String moTa;
    private boolean trangThai;

    public SanPham() {
    }

    public SanPham(int idSP, String maSP, String ten, Date ngayTao, String moTa, boolean trangThai) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    public SanPham(int idSP, String maSP, String ten) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.ten = ten;

    }
    public SanPham( String maSP, String ten) {
        
        this.maSP = maSP;
        this.ten = ten;

    }

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] rowData(){
        return new Object[]{this.idSP,this.maSP,this.ten};
    }

}
