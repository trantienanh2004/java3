/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.service;

import java.util.List;
import poly.edu.model.product;
import poly.edu.reponstory.productReponstory;

/**
 *
 * @author HP
 */
public class productService {
    private final productReponstory prodReponstory;

    public productService() {
        this.prodReponstory = new productReponstory();
    }

   
    
    public List<product> getallproduct(){
        return prodReponstory.getallproduct();
    }
}
