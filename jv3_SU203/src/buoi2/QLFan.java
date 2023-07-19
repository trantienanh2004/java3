/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class QLFan  {
  private ArrayList<Fan> dsfan = new ArrayList<>();
    public void add(Fan f){
        dsfan.add(f);
    }

    public ArrayList<Fan> getDsfan() {
        return dsfan;
    }
public void delete(int vt ){
    dsfan.remove(vt);
}
public void undate(int vt, Fan f){
    dsfan.set(vt, f);
}
    public void setDsfan(ArrayList<Fan> dsfan) {
        this.dsfan = dsfan;
    }
    
}
