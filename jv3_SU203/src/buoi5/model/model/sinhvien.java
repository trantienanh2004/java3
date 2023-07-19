/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5.model.model;

/**
 *
 * @author HP
 */
public class sinhvien {
    private String masv;
    private String ten;
    private double diem;

    public sinhvien(String masv, String ten, double diem) {
        this.masv = masv;
        this.ten = ten;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
}
