/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import poly.edu.model.sach;
import poly.edu.untitity.DB;

/**
 *
 * @author HP
 */
public class sachservice {
   public ArrayList<sach> getallsach(){
       ArrayList<sach> dssach = new ArrayList<>();
       Connection cn = DB.getConnection();
       try {
           String sql = "select * from sach join theloai on sach.matheloai = theloai.matheloai";
           PreparedStatement pd = cn.prepareStatement(sql);
           ResultSet rs = pd.executeQuery();
           while (rs.next()) {               
               sach sach = new sach();
               sach.setMasach(rs.getString("masach"));
               sach.setTensach(rs.getString("tensach"));
               sach.setNxb(rs.getString("nxb"));
               sach.setMaloai(rs.getString("matheloai"));
               sach.setGiatien(rs.getDouble("giatien"));
               dssach.add(sach);
           }
       } catch (Exception e) {
       }
       return dssach;
   } 
   public Integer addsach(sach sach){
       Integer row = null;
       Connection cn = DB.getConnection();
       try {
           String sql = "insert into SACH(Masach,TenSach,NXB,MaTheLoai,Giatien)\n" +
"values(?,?,?,?,?)";
           PreparedStatement pd = cn.prepareStatement(sql);
           pd.setString(1, sach.getMasach());
           pd.setString(2, sach.getTensach());
           pd.setString(3, sach.getNxb());
           pd.setString(4, sach.getMaloai());
           pd.setDouble(5, sach.getGiatien());
           row = pd.executeUpdate();
       } catch (Exception e) {
       }
       return row;
}
   public Integer suasach(sach sach){
       Integer row = null;
       Connection cn = DB.getConnection();
       try {
           String sql = "update SACH"
                   + "set TenSach = ?,NXB = ?,MaTheLoai = ?,Giatien=?)"
                   + "where masach = ?";
           PreparedStatement pd = cn.prepareStatement(sql);
           
           pd.setString(1, sach.getTensach());
           pd.setString(2, sach.getNxb());
           pd.setString(3, sach.getMaloai());
           pd.setDouble(4, sach.getGiatien());
           pd.setString(5, sach.getMasach());
           row = pd.executeUpdate();
       } catch (Exception e) {
       }
       return row;
}
   public Integer xoasach(String masach){
       Integer row = null;
       Connection cn = DB.getConnection();
       try {
           String sql = "delete from SACH" +
"where masach = ?";
           PreparedStatement pd = cn.prepareStatement(sql);
           pd.setString(1, masach);
            row = pd.executeUpdate();
       } catch (Exception e) {
       }
       return row;
}
}
