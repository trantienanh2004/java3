/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.service;

import java.util.List;
import poly.edu.model.category;
import poly.edu.reponstory.CategoryReponstory;

/**
 *
 * @author HP
 */
public class categoryService {
    private final CategoryReponstory categoryReponstory;

    public categoryService() {
        this.categoryReponstory = new CategoryReponstory();
    }
    
    public List<category> getallcategory(){
        return categoryReponstory.GetAllCategory();
    }
}
