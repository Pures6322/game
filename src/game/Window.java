/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pures6322
 */
public class Window {
    
    Event action = new Event();
    
    Terrain terrain = new Terrain();
    
    FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
    
    JFrame frame = new JFrame("JumpMan!");
    
    JButton play = new JButton("PLAY");
    
    JLabel label = new JLabel("JumpMan!");
    Container c = frame.getContentPane();
    Font font = new Font("Courier", Font.BOLD, 24);

    public void createWindow() {
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(flow);
        c.setBackground(new Color(100, 0, 100));
        
        label.setFont(font);
        label.setForeground(Color.white);
        
        play.addActionListener(action);
        
        frame.setResizable(false);
        frame.add(label);
        frame.add(play);
    }

    private class Event implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();
            if (src == play) {
//                JOptionPane.showMessageDialog(frame, "JumpMan!");
                play.setVisible(false);
                label.setVisible(false);
                c.setBackground(new Color(51, 153, 255));
                frame.setLayout(null);
                frame.add(terrain.Dirt());
                frame.add(terrain.Grass());
            }
        }
    }
    
}
