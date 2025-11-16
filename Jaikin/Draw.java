package Jaikin;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

class Draw extends JPanel { 
    
    private  List<Point> points; 
    
    public Draw(List<Point> points){
        this.points=points;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        for(Point p:this.points){
            g.setColor(Color.white);
            g.drawOval(p.getX(), p.getY(), 10, 10);
        }
    }
}
