/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.untitity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class jdbcheper {
    public static ResultSet TruyVan(String sql ,Object ...args) {
        Connection ct = null;
        ResultSet rl = null;
        PreparedStatement ps = null;
        
        ct= DB.getConnection();
        try {
            ps = ct.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
               ps.setObject(i+1, args);
            }
            rl = ps.executeQuery();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return rl;
    }
    
    
    
    
     public static Integer TruyVancapnhat(String sql ,Object ...args) {
        Connection ct = null;
        Integer row = 0;
        PreparedStatement ps = null;
        
        ct= DB.getConnection();
        try {
            ps = ct.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
               ps.setObject(i+1, args[i]);
            }
            row = ps.executeUpdate();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return row;
    }
     
   
}
