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
import poly.edu.model.product;
import poly.edu.untitity.jdbcheper;

/**
 *
 * @author HP
 */
public class productReponstory {
    public  List<product> getallproduct(){
        List<product> pd = new ArrayList<>();
        String sql = "select * from product inner join category on product.category = category.id";
        ResultSet rs = jdbcheper.TruyVan(sql);
        try {
            while (rs.next()) {
                category cg = new category(rs.getInt(5), rs.getString(6));
                Integer id = rs.getInt(1);
                String name = rs.getString(2);
                Double price = rs.getDouble(3);
                pd.add(new product(id, name, price, cg));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pd;
    }
}
