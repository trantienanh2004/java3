/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

/**
 *
 * @author HP
 */
public class ChuyenDe {
    private String macd;
    private String TenChuyenDe;
    private float HocPhi;
    private int ThoiLuong;
    private String Hinh;
    private String MoTa;

    public ChuyenDe() {
    }

    public ChuyenDe(String macd, String TenChuyenDe, float HocPhi, int ThoiLuong, String Hinh, String MoTa) {
        this.macd = macd;
        this.TenChuyenDe = TenChuyenDe;
        this.HocPhi = HocPhi;
        this.ThoiLuong = ThoiLuong;
        this.Hinh = Hinh;
        this.MoTa = MoTa;
    }

    public String getMacd() {
        return macd;
    }

    public void setMacd(String macd) {
        this.macd = macd;
    }

    public String getTenChuyenDe() {
        return TenChuyenDe;
    }

    public void setTenChuyenDe(String TenChuyenDe) {
        this.TenChuyenDe = TenChuyenDe;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(float HocPhi) {
        this.HocPhi = HocPhi;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    
    
}
