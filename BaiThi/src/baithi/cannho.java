/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baithi;

/**
 *
 * @author HP
 */
public class cannho {

    /**
     * @param args the command line arguments
     */
    public void chuhayso( String nhap){
        String nhap = " ";
        
        //System.out.println(""+nhap.replaceAll("//d", ""));
        System.out.println(""+nhap);
    }
    
   
    
    public void checkgiatristring(){
        
       String nhap = "1223234546zx";
       
String check = "[0-9]+";
       
       if (nhap.matches(check)){
           System.out.println("nhập đúng");
       }else{
              System.out.println("nhập sai");
       }
    }
    
    
}
