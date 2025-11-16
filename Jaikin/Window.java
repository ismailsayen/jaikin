package Jaikin;

import java.awt.Color;
import javax.swing.JFrame;

public class Window {
    private JFrame frame;

    public Window() {
        this.frame = new JFrame("JAINKIN");
    }

    public void intialze() {
        frame.setSize(800, 800);
        frame.setLocation(500, 100);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.addKeyListener(new KeyboardListner()); 
        frame.addMouseListener(new MouseListner()); 
        frame.setFocusable(true); 
        frame.requestFocusInWindow();
        frame.setVisible(true);
    }
    

}
