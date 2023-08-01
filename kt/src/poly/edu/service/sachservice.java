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

/**
 *
 * @author HP
 */
public class sachservice {
    public ArrayList<sach> getallsach(){
        ArrayList<sach> sach =  new ArrayList<>();
        try {
            String sql = "select * from sach";
            Connection cn = DB.getConnection();
            PreparedStatement pd = cn.prepareStatement(sql);
            ResultSet rs = pd.executeQuery();
            while(rs.next()){
                sach s = new sach();
                s.setMasach(rs.getString("MaSach"));
                s.setTensach(rs.getString("TenSach"));
                s.setSoluong(rs.getInt("Soluong"));
                s.setGiatien(rs.getInt("GiaTien"));
                sach.add(s);
            }
        } catch (Exception e) {
        }
        return sach;
    }
    
    
   public Integer addsach(sach sach){
       Integer row = null;
        ArrayList<sach> s =  new ArrayList<>();
        try {
            String sql = "insert into sach values(?,?,?,?)";
            Connection cn = DB.getConnection();
            PreparedStatement pd = cn.prepareStatement(sql);
          pd.setString(1, "Masach");
          pd.setString(2, "Tensach");
          pd.setString(3, "soluong");
          pd.setString(4, "giatien");
      row =  pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return row;
  }
   public Integer suasach(sach sach){
       Integer row = null;
        ArrayList<sach> s =  new ArrayList<>();
        try {
            String sql = "update sach "
                    + "set masach = ?,tensach = ?,soluong = ? , giatien = ?"
                    + "where masach like ?"
                    ;
            Connection cn = DB.getConnection();
            PreparedStatement pd = cn.prepareStatement(sql);
          pd.setString(1, "Masach");
          pd.setString(2, "Tensach");
          pd.setString(3, "soluong");
          pd.setString(4, "giatien");
      row =  pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return row;
  }
   public Integer xoasach(sach sach){
       Integer row = null;
        ArrayList<sach> s =  new ArrayList<>();
        try {
            String sql = "delete from sach where = ?";
            Connection cn = DB.getConnection();
            PreparedStatement pd = cn.prepareStatement(sql);
          pd.setString(1, "Masach");
        
      row =  pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       return row;
  }
}
