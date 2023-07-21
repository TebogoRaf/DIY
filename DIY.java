/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.diy;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author tebog
 */
public class DIY extends JFrame{
    public DIY(){
        setTitle("Tebogo Rafapa");
        setSize(350,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setForeground(Color.black);
    }
}
