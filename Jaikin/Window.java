package Jaikin;

import java.awt.Color;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
    private JFrame frame;
    private List<Point> points;
    private boolean isStated;

    public Window() {
        this.frame = new JFrame("JAINKIN");
        this.points = new ArrayList<>();
        this.isStated = false;
    }

    public void intialze() {
        frame.setSize(800, 800);
        frame.setLocation(500, 100);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        JPanel canva = new Draw(this);
        frame.addKeyListener(new KeyboardListner(this));
        canva.addMouseListener(new MouseListner(this));
        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.add(canva);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return this.frame;
    }

    public List<Point> getPoints() {
        return this.points;
    }

    public void setPoints(List<Point> p) {
        this.points = p;
    }

    public boolean getIsStarted() {
        return this.isStated;
    }

    public void setIsStarted(boolean p) {
        this.isStated = p;
    }

}
