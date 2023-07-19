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
import poly.edu.model.category;
import poly.edu.untitity.jdbcheper;

/**
 *
 * @author HP
 */
public class CategoryReponstory {

   public List<category> GetAllCategory(){
       List<category> ct = new ArrayList<>();
       String sql = "select * from category";
       ResultSet rs = jdbcheper.TruyVan(sql);
       try {
           while (rs.next()) {
               Integer id = rs.getInt("id");
               String name = rs.getString("name");
               ct.add( new category(id, name));
           }
       } catch (SQLException ex) {
           Logger.getLogger(CategoryReponstory.class.getName()).log(Level.SEVERE, null, ex);
       }
       return ct;
   }
}
