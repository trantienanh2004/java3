/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.reponstory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.model.USERS;
import poly.edu.model.grade;
import poly.edu.model.students;
import poly.edu.untitity.jdbcheper;

/**
 *
 * @author HP
 */
public class studentsReponstory {
    public  List<students> getallStudents(){
        List<students> dssv = new ArrayList<>();
        String sql = "SELECT * FROM STUDENTS  ";
        ResultSet rs = jdbcheper.TruyVan(sql);
        try {
            while (rs.next()) {

                String masv = rs.getString(1);
                String hoten = rs.getString(2);
                String email = rs.getString(3);
                int sodt = rs.getInt(4);
                int gioitinh = rs.getInt(5);
                String diachi = rs.getString(6);
                String hinh = rs.getString(7);
           
                dssv.add(new students(masv, hoten, email, sodt, gioitinh, diachi, hinh));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dssv;
    }
    
    
     public Integer addQLSV( students sv){
        String spl ="insert into STUDENTS values (?,?,?,?,?,?,?)";
        Integer row = jdbcheper.TruyVancapnhat(spl, sv.getMasv(),sv.getHoten(),sv.getEmail(),sv.getSodt(),sv.getGioitinh(),sv.getDiachi(),sv.getHinh());
        return row;
    }
     public Integer UPDATEQLSV( students sv){
        String spl ="update STUDENTS\n" +
"set MASV = ? , HOTEN = ? , EMAIL = ? ,SODT = ?,GIOITINH = ?, DIACHI =?, HINH =?\n" +
"WHERE MASV = ?";
        Integer row = jdbcheper.TruyVancapnhat(spl, sv.getMasv(),sv.getHoten(),sv.getEmail(),sv.getSodt(),sv.getGioitinh(),sv.getDiachi(),sv.getHinh(),sv.getMasv());
        return row;
    }
      public Integer DELETESTUDENTS( students sv){
      String spl ="EXEC XOA ?";
        Integer row = jdbcheper.TruyVancapnhat(spl,sv.getMasv());
      return row;
    }
}
