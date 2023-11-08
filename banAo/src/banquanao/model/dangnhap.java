/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banquanao.model;

/**
 *
 * @author HP
 */
public class dangnhap {
    private String matk, user ,pass,DiaChi,TenNV,MAQH,role,trangthai,Ghichu;
    private int gioitinh,sodienthoai;

    public dangnhap() {
    }

    public dangnhap(String matk, String user, String pass, String DiaChi, String TenNV, String MAQH, String role, String trangthai, String Ghichu, int gioitinh, int sodienthoai) {
        this.matk = matk;
        this.user = user;
        this.pass = pass;
        this.DiaChi = DiaChi;
        this.TenNV = TenNV;
        this.MAQH = MAQH;
        this.role = role;
        this.trangthai = trangthai;
        this.Ghichu = Ghichu;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
    }

    public String getMatk() {
        return matk;
    }

    public void setMatk(String matk) {
        this.matk = matk;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getMAQH() {
        return MAQH;
    }

    public void setMAQH(String MAQH) {
        this.MAQH = MAQH;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(int sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    
    
}
