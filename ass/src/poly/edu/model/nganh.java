/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.edu.model;

/**
 *
 * @author HP
 */
public class nganh {
    private String manganh;
    private String tennganh;

    public nganh(String nganh, String tennganh) {
        this.manganh = nganh;
        this.tennganh = tennganh;
    }

    public nganh() {
    }

    public String getNganh() {
        return manganh;
    }

    public void setNganh(String nganh) {
        this.manganh = nganh;
    }

    public String getTennganh() {
        return tennganh;
    }

    public void setTennganh(String tennganh) {
        this.tennganh = tennganh;
    }

    @Override
    public String toString() {
        return   tennganh+manganh  ;
    }

    
    
    
    
    
}
