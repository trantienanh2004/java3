/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.service;

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

    public List<grade> getallGrade() {
        List<grade> dsdiem = new ArrayList<>();
        String sql = "SELECT TOP 3 ID, GRADE.MASV, HOTEN,TIENGANH,TINHOC,GDTC,SUM((TIENGANH+TINHOC+GDTC)/3) AS TB\n" +
" FROM GRADE join STUDENTS on students.masv = GRADE.masv\n" +
"GROUP BY ID,GRADE.MASV, HOTEN,TIENGANH,TINHOC,GDTC\n" +
"ORDER BY SUM((TIENGANH+TINHOC+GDTC)/3) DESC";
        ResultSet rs = jdbcheper.TruyVan(sql);
        try {
            while (rs.next()) {
                grade g = new grade();
                int id = rs.getInt(1);
                String hoten = rs.getString("hoten");
                String masv = rs.getString("masv");
                double tienganh = rs.getDouble("tienganh");
                double tinhoc = rs.getDouble("tinhoc");
                double gdtc = rs.getDouble("GDTC"); 
                double diemtb = rs.getDouble("TB");
                dsdiem.add(new grade(id, hoten, masv, tienganh, tinhoc, gdtc, diemtb));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dsdiem;
    }

    public List<grade> timkiemmasv() {
        List<grade> dsdiem = new ArrayList<>();
        String sql = "select grade.masv, hoten,tienganh,tinhoc,gdtc from GRADE join STUDENTS on GRADE.MASV = STUDENTS.MASV\n"
                + "where grade.masv  = ?\n"
                + "group by grade.masv, hoten,tienganh,tinhoc,gdtc";
        ResultSet rs = jdbcheper.TruyVan(sql);
        try {
            while (rs.next()) {
                grade g = new grade();
                int id = rs.getInt(1);
                String hoten = rs.getString("hoten");
                String masv = rs.getString("masv");
                double tienganh = rs.getDouble("tienganh");
                double tinhoc = rs.getDouble("tinhoc");
                double gdtc = rs.getDouble("GDTC");
                double tong = (tienganh + tinhoc + gdtc) / 3;
                double diemtb = Math.round(tong * 10) / 10.0;
                dsdiem.add(new grade(id, hoten, masv, tienganh, tinhoc, gdtc, diemtb));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dsdiem;
    }

    public Integer addGrade(grade gr) {
        String spl = "EXEC DL_GRADE ?,?,?,?";
        Integer row = jdbcheper.TruyVancapnhat(spl, gr.getMasv(), gr.getTienganh(), gr.getTinhoc(), gr.getGdtc());
        return row;
    }

    public Integer UpdateGrade(grade gr) {
        String spl = "update GRADE \n"
                + "set  MASV = ?, TIENGANH =?, TINHOC  =? ,GDTC  = ?\n"
                + "WHERE ID = ?";
        Integer row = jdbcheper.TruyVancapnhat(spl, gr.getMasv(), gr.getTienganh(), gr.getTinhoc(), gr.getGdtc(), gr.getId());
        return row;
    }

    public Integer DELETEgrade(grade gr) {
        String spl = "EXEC XOA ?";
        Integer row = jdbcheper.TruyVancapnhat(spl, gr.getMasv());
        return row;
    }
    
}
