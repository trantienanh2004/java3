/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.model.USERS;
import poly.edu.untitity.jdbcheper;

/**
 *
 * @author HP
 */
public class usersService {

   public List<USERS> GetAllUsers(){
       List<USERS> dstk = new ArrayList<>();
       String sql = "select * from USERS";
       ResultSet rs = jdbcheper.TruyVan(sql);
       try {
           while (rs.next()) {
               String name = rs.getString(1);
               String pass = rs.getString(2);
               String role = rs.getString(3);
               
               dstk.add(new USERS(pass , name , role));
           }
       } catch (SQLException ex) {
           Logger.getLogger(usersService.class.getName()).log(Level.SEVERE, null, ex);
       }
       return dstk;
   }
}
