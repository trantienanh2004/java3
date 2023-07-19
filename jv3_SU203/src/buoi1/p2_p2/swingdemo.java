/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1.p2_p2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author HP
 */
public class swingdemo extends Frame {
    Button red ,  blue;
    Label text;
   public  swingdemo(){
     
       setTitle("demo ");
       setSize(500, 250);
       setLocationRelativeTo(null);
       setResizable(false);
  
       red = new Button();
       blue  = new Button();
      text = new Label();
       add(red);
       add(blue);
       add(text);
       
       
       red.addActionListener( new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               red.setBackground(Color.red);
               text.setText("red");
           }
       });
       red.addActionListener( new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               blue.setBackground(Color.blue);
               text.setText("blue");
           }
       });
      
   }
}
