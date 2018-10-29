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
public class Terrain {
    
    public JPanel Dirt(){
        JPanel dirt = new JPanel();
        dirt.setBounds(0, 350, 500, 150);
        dirt.setBackground(new Color(102, 51, 0));
        
        return(dirt);
    }
    
    public JPanel Grass(){
        JPanel grass = new JPanel();
        grass.setBounds(0, 340, 500, 200);
        grass.setBackground(new Color(0, 255, 0));
        
        return(grass);
    }
}
