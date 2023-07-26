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
public class students {
    private  String masv;
    private String hoten;
    private  String email;
    private int sodt;
    private int gioitinh;
    private  String diachi;
    private String hinh;

    public students() {
    }

    public students(String masv, String hoten, String email, int sodt, int gioitinh, String diachi, String hinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.email = email;
        this.sodt = sodt;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.hinh = hinh;
    }

    public students(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSodt() {
        return sodt;
    }

    public void setSodt(int sodt) {
        this.sodt = sodt;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    

   
}
