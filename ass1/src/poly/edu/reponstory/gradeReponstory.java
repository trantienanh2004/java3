/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.reponstory;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import poly.edu.model.grade;
import poly.edu.model.students;
import poly.edu.untitity.jdbcheper;

/**
 *
 * @author HP
 */
public class gradeReponstory {
    public List<grade> getallGrade(){
    List<grade> dsdiem = new ArrayList<>();
    String sql = "select * from grade join students on grade.masv = students.masv";
        ResultSet rs = jdbcheper.TruyVan(sql);
        try {
            while (rs.next()) {                
      int id = rs.getInt(1) ;
     
     String masv = rs.getString(2) ;
     String tienganh = rs.getString(3) ;
     String tinhoc = rs.getString(4) ;
     String gdtc= rs.getString(5) ;
     dsdiem.add(new grade(id, masv, tienganh, tinhoc, gdtc));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return dsdiem;
}
}
