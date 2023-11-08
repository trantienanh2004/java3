/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class SanPhamCT {

    /* MaSPCT	varchar(7)		primary key,
	DonGia	money			not null,
	SL		int				not null,
	IDSP	int				foreign key references SanPham(IDSP),
	MaMau	varchar(7)		foreign key references MauSac(MaMau),
	MaSize	varchar(7)		foreign key references Size(MaSize),
	MaCL	varchar(7)	foreign key references ChatLieu(MaCL)
     */
    private String maSPCT;
    private float donGia;
    private int soLuong;
    private SanPham sp;
    private MauSac mauSac;
    private Size size;
    private ChatLieu chatLieu;

    public SanPhamCT() {
    }

    public SanPhamCT(String maSPCT, float donGia, int soLuong, SanPham sp, MauSac mauSac, Size size, ChatLieu chatLieu) {
        this.maSPCT = maSPCT;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.sp = sp;
        this.mauSac = mauSac;
        this.size = size;
        this.chatLieu = chatLieu;
    }

    public SanPhamCT(SanPham sp, MauSac mauSac, Size size, ChatLieu chatLieu, float donGia, int soLuong) {

        this.sp = sp;
        this.mauSac = mauSac;
        this.size = size;
        this.chatLieu = chatLieu;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(String maSPCT) {
        this.maSPCT = maSPCT;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

    public Object[] rowData() {
        return new Object[]{this.sp.getMaSP(), this.sp.getTen(),
            this.mauSac.getTenMau(), this.size.getGiaTri(), this.chatLieu.getTenCL(), this.donGia, this.soLuong};
    }

}
