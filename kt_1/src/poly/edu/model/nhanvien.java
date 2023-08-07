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
public class nhanvien {
    
    private String manv;
    private String hoten;
    private String gioitinh;
    private String id;

    public nhanvien(String manv, String hoten, String gioitinh, String id) {
        this.manv = manv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.id = id;
    }

    

    public nhanvien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void getId(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
