/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.service;

import poly.edu.untitity.DB;
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
               ArrayList<sach> dssach = new ArrayList<>();
               Connection cn = DB.getConnection();
               try {
                   String sql ="select * from sach";
                   PreparedStatement pd = cn.prepareStatement(sql);
                   ResultSet rs = pd.executeQuery();
                   while (rs.next()) {                       
                       sach s = new sach();
                       s.setMasach(rs.getString("masach"));
                       s.setTensach(rs.getString("tensach"));
                       s.setSoluong(rs.getInt("soluong"));
                       s.setGiatien(rs.getInt("giatien"));
                       dssach.add(s);
                   }
               } catch (Exception e) {
                   e.printStackTrace();
               }
 return dssach;
           }
           public Integer addsach(sach s){
               Integer row = null;
               Connection cn = DB.getConnection();
               try {
                   String sql ="insert into sach (Masach,TenSach,SoLuong,Giatien) values"
                           + " (?,?,?,?)";
                   PreparedStatement pd = cn.prepareStatement(sql);
                  pd.setString(1, s.getMasach());
                  pd.setString(2, s.getTensach());
                  pd.setInt(3, s.getSoluong());
                  pd.setInt(4, s.getGiatien());
                                      
                     row = pd.executeUpdate();
               } catch (Exception e) {
                   e.printStackTrace();
               }
 return row;
           }
           public Integer xoasach(String s){
             Integer row = null;
               Connection cn = DB.getConnection();
               try {
                   String sql ="delete sach where masach = ? ";
                          
                   PreparedStatement pd = cn.prepareStatement(sql);
                  pd.setString(1, s);
                 
                                      
                    row  = pd.executeUpdate();
               } catch (Exception e) {
                   e.printStackTrace();
               }
 return row;
           }
}
