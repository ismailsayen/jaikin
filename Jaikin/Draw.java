package Jaikin;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class Draw extends JPanel {

    private Window window;

    public Draw(Window window) {
        this.window = window;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        for (Point p : this.window.getPoints()) {
            g.setColor(Color.white);
            g.drawOval(p.getX(), p.getY(), 7, 7);
        }
        if (window.getIsStarted()) {
        
            for (int i=0;i<window.getPoints().size()-1;i++) {
                Point p1=window.getPoints().get(i);
                Point p2=window.getPoints().get(i+1);
                g.setColor(Color.GREEN);
                g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            }
        }
    }
}
