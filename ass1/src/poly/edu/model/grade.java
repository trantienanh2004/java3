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
    private String tienganh ;
    private String tinhoc ;
    private String gdtc ;

    public grade() {
    }

    public grade(int id, String HoTen, String masv, String tienganh, String tinhoc, String gdtc) {
        this.id = id;
        this.HoTen = HoTen;
        this.masv = masv;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
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

    public String getTienganh() {
        return tienganh;
    }

    public void setTienganh(String tienganh) {
        this.tienganh = tienganh;
    }

    public String getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(String tinhoc) {
        this.tinhoc = tinhoc;
    }

    public String getGdtc() {
        return gdtc;
    }

    public void setGdtc(String gdtc) {
        this.gdtc = gdtc;
    }

    public Object getdiemtb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
    
    
    
    
    
}
