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

/**
 *
 * @author HP
 */
public class servicenhanvien {
   public ArrayList<nhanvien>getallnhanvien(){
        ArrayList<nhanvien> dsnv = new ArrayList<>();
        Connection cn = DB.getConnection();
        try {
            String sql = "select * from NHANVIEN";
            PreparedStatement pd = cn.prepareStatement(sql);
            ResultSet rs = pd.executeQuery();
            while (rs.next()) {                
                nhanvien nv = new nhanvien();
                nv.setManv(rs.getNString(1)) ;
                nv.setTen(rs.getNString(3))  ;
                nv.setMatkhau( rs.getNString(2)) ;
                nv.setVaitro( rs.getNString(4)) ;
                dsnv.add(nv);
            }
        } catch (Exception e) {
        }
        return dsnv;
    }
}
