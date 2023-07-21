/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.service;

import java.util.List;
import poly.edu.model.USERS;
import poly.edu.reponstory.usersReponstory;

/**
 *
 * @author HP
 */
public class categoryService {
    private final usersReponstory categoryReponstory;

    public categoryService() {
        this.categoryReponstory = new usersReponstory();
    }
    
    public List<USERS> getallcategory(){
        return categoryReponstory.GetAllCategory();
    }
}
