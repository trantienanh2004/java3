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
import javax.swing.JOptionPane;
import poly.edu.model.nhanvien;
import poly.edu.untitity.DB;

/**
 *
 * @author HP
 */
public class phongbanService {
   public ArrayList<nhanvien> addphongban(){
        ArrayList<nhanvien> gioitinh = new ArrayList<>();
       Connection cn = DB.getConnection();;
       try {
           String sql = "select * from NHANVIEN";
           PreparedStatement pd = cn.prepareStatement(sql);
           ResultSet rs = pd.executeQuery();
           while (rs.next()) {               
               nhanvien nv=  new nhanvien();
               nv.setId(rs.getString("id"));
               nv.setHoten(rs.getString("hoten"));
               nv.setGioitinh(rs.getString("gioitinh"));
               gioitinh.add(nv);
           }
       } catch (Exception e) {
       }
       return gioitinh;
   }
   
   public Integer add(nhanvien nv){
        Integer row = null;
       
       Connection cn = DB.getConnection();;
       try {
           String sql = "insert into NHANVIEN(hoten,gioitinh) values (?,?)";
           PreparedStatement pd = cn.prepareStatement(sql);
           
           pd.setString(1, nv.getHoten());
           pd.setString(2, nv.getGioitinh());
                       
            row = pd.executeUpdate();
            
           
       } catch (Exception e) {
           e.printStackTrace();
       }
       return row;
   }
    public Integer update(nhanvien nv){
        Integer row = null;
       
       Connection cn = DB.getConnection();;
       try {
           String sql = "update nhanvien"
                   + "set hoten = ?,gioitinh = ?"
                   + "where id=?"
                   ;
           PreparedStatement pd = cn.prepareStatement(sql);
           
           pd.setString(1, nv.getHoten());
           pd.setString(2, nv.getGioitinh());
           pd.setString(3, nv.getId());
                       
            row = pd.executeUpdate();
            
           
       } catch (Exception e) {
           e.printStackTrace();
       }
       return row;
   }
}
