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
import poly.edu.model.nganh;
import poly.edu.reponstory.DB;

/**
 *
 * @author HP
 */
public class nganhservice {
   public ArrayList<nganh> getAddNganh(){
       ArrayList<nganh> lst  = new ArrayList<>();
       try {
           String sql  = "select * from nganh";
           Connection cn = DB.getConnection();
           PreparedStatement ps = cn.prepareStatement(sql);
           ResultSet rs  = ps.executeQuery();
           while (rs.next()) {               
               nganh n = new nganh();
               n.setTennganh(rs.getString("tenNganh"));
               n.setNganh(rs.getString("MaNganh"));
               lst.add(n);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return lst;
              
   } 
}
