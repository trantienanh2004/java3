/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import poly.edu.model.nhanvien;
import poly.edu.untitity.DB;
import poly.edu.untitity.jdbcheper;

/**
 *
 * @author HP
 */
public class serviceNhanvien {
    
    
   public ArrayList<nhanvien> getallnhanvien(){
        ArrayList<nhanvien> dsnv = new ArrayList<>();
        Connection cn = DB.getConnection();
        try {
            String sql = "SELECT * FROM NHANVIEN";
          
            ResultSet rs = jdbcheper.TruyVan(sql);
            while (rs.next()) {                
                nhanvien nv = new nhanvien();
                nv.setManv(rs.getNString(1));
                nv.setMatkhau(rs.getNString(2));
                nv.setTen(rs.getNString(3));
                String vitri = rs.getInt(4) == 0?"nhanvien":"truongphong" ;
                
                nv.setVaitro(vitri);
                dsnv.add(nv);
            }
        } catch (Exception e) {
        }
        return dsnv;
    }
   public Integer updatenhanvien(nhanvien nv){
       String sql = "update NHANVIEN \n" +
"set MANV = ? ,MATKHAU = ?,HOTEN = ?,VITRI = ?\n" +
"WHERE MANV = ?";
       Integer row = jdbcheper.TruyVancapnhat(sql,nv.getManv(), nv.getMatkhau(),nv.getTen(),nv.getVaitro(),nv.getManv());
       return row;
   }
      public Integer addnhanvien(nhanvien nv){
       String sql = "insert into nhanvien(manv,matkhau,hoten,vitri) values"
               + "(?,?,?,?)";
       Integer row = jdbcheper.TruyVancapnhat(sql,nv.getManv(), nv.getMatkhau(),nv.getTen(),nv.getVaitro());
       return row;
   }
         public Integer deletenhanvien(nhanvien nv){
       String sql = "delete nhanvien where manv = ?";
       Integer row = jdbcheper.TruyVancapnhat(sql,nv.getManv());
       return row;
   }

    public Object deletenhanvien(String m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
