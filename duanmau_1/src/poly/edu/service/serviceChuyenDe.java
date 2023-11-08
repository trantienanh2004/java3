/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;


import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import poly.edu.model.ChuyenDe;
import poly.edu.untitity.DB;
import poly.edu.untitity.jdbcheper;

/**
 *
 * @author HP
 */
public class serviceChuyenDe {
    
    public ArrayList<ChuyenDe> getallchuyende(){
        ArrayList<ChuyenDe> dscd = new ArrayList<>();
        Connection cn = DB.getConnection();
        try {
            String sql = "select * from CHUYENDE";
            ResultSet rs = jdbcheper.TruyVan(sql);
            while (rs.next()) {                
                ChuyenDe cd = new ChuyenDe();
                cd.setMacd(rs.getNString(1));
                cd.setTenChuyenDe(rs.getNString(2));
                cd.setThoiLuong(rs.getInt(4));
                cd.setHocPhi(rs.getFloat(3));
                cd.setHinh(rs.getNString(5));
                cd.setMoTa(rs.getNString(6));
              dscd.add(cd);  
            }
        } catch (Exception e) {
        }
        return dscd;
    }
    
}
