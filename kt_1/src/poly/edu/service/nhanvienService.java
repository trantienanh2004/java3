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
import poly.edu.model.nhanvien;
import poly.edu.untitity.DB;

/**
 *
 * @author HP
 */
public class nhanvienService {
    
    
    public ArrayList<nhanvien> getallnv(){
       ArrayList<nhanvien> dsnv = new ArrayList<>();
        Connection cn = DB.getConnection();
        try {
            String sql = "select * from nhanvien";
            PreparedStatement pd = cn.prepareStatement(sql);
            ResultSet rs = pd.executeQuery();
            while (rs.next()) {                
                nhanvien nv = new nhanvien();
                nv.setId(rs.getString("id"));
                nv.setManv(rs.getString("manv"));
                nv.setHoten(rs.getString("hoten"));
                nv.setGioitinh(rs.getString("gioitinh"));
                dsnv.add(nv);
            }
        } catch (Exception e) {
        }
       return dsnv;
    }
    
    public Integer add(nhanvien nv){
       Integer row = null;
        Connection cn = DB.getConnection();
        try {
            String sql = "insert into nhanvien (manv,hoten,gioitinh) values (?,?,?)";
            PreparedStatement pd = cn.prepareStatement(sql);
           
            pd.setString(1,nv.getManv());
            pd.setString(2,nv.getHoten());
            pd.setString(3,nv.getGioitinh());
          row = pd.executeUpdate();
        } catch (Exception e) {
        }
       return row;
    }
    public Integer sua(nhanvien nv){
       Integer row = null;
        Connection cn = DB.getConnection();
        try {
            String sql = "update nhanvien "
                    + "set manv = ? , tennv = ? , gioitinh = ?"
                    + "where id =?";
            PreparedStatement pd = cn.prepareStatement(sql);
           pd.setString(4, nv.getId());
            pd.setString(1,nv.getManv());
            pd.setString(2,nv.getHoten());
            pd.setString(3,nv.getGioitinh());
          row = pd.executeUpdate();
        } catch (Exception e) {
        }
       return row;
    }
    
}
