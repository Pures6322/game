/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Pures6322
 */
public class Player {
    int x = 50;
    int y = 200;
    int w = 50;
    int h = 100;
    
    JPanel man = new JPanel();
    
    public JPanel JumpMan(){
        man.setBounds(x, y, w, h);
        man.setBackground(new Color(0, 0, 0));
        man.setVisible(true);
        return(man);
    }
    
}
