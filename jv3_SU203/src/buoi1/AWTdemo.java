/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class AWTdemo extends JFrame{
    Button red, yellow;
    Label bltresult;
    public AWTdemo(){
        setLayout(new FlowLayout());
        
        
        setTitle("demoAWT");
                setLocationRelativeTo(null);
                setSize(450,250);
        
        red  = new Button("red");
        yellow = new Button("yellow");
        bltresult = new Label("tresult");
        add(red);
        add(yellow);
        add(bltresult);
        //gán sự kiện
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.yellow);
                 bltresult.setText("red");
            }
        });
        yellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.yellow);
                
                bltresult.setText("yellow");
                
            }
        });
    }
}
