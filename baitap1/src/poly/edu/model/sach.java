/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.model;

/**
 *
 * @author HP
 */
public class sach {
    private String masach;
    private String tensach;
    private String nxb;
    private String maloai;
    private double giatien;

    public sach(String masach, String tensach, String nxb, String maloai, double giatien) {
        this.masach = masach;
        this.tensach = tensach;
        this.nxb = nxb;
        this.maloai = maloai;
        this.giatien = giatien;
    }

    public sach() {
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }
    
}
