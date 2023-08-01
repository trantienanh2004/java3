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
public class nganhh {
   public ArrayList<nganh> getallnganh(){
       ArrayList<nganh> ds = new ArrayList<>();
       try {
           String sql = "select * from nganh";
           Connection cn = DB.getConnection();
           PreparedStatement pd=cn.prepareStatement(sql);
           ResultSet rs = pd.executeQuery();
           if(rs.next()){
               nganh n =new nganh();
               n.setNganh(rs.getString("tennganh"));
               n.setTennganh(rs.getString("manganh"));
               ds.add(n);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return ds;
   }
}
