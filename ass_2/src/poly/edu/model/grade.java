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
public class grade {
    private int id ;
    private String HoTen ;
    private String masv ;
    private double tienganh ;
    private double tinhoc ;
    private double gdtc ;
    private double diemtb;

    public grade() {
    }

    public grade(int id, String HoTen, String masv, double tienganh, double tinhoc, double gdtc) {
        this.id = id;
        this.HoTen = HoTen;
        this.masv = masv;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }

    public grade(int id, String HoTen, String masv, double tienganh, double tinhoc, double gdtc, double diemtb) {
        this.id = id;
        this.HoTen = HoTen;
        this.masv = masv;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
        this.diemtb = diemtb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public double getTienganh() {
        return tienganh;
    }

    public void setTienganh(double tienganh) {
        this.tienganh = tienganh;
    }

    public double getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(double tinhoc) {
        this.tinhoc = tinhoc;
    }

    public double getGdtc() {
        return gdtc;
    }

    public void setGdtc(double gdtc) {
        this.gdtc = gdtc;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }
   

 

    
    
   

   

    

    
    
    
    
    
    
    
    
}
