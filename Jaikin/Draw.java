package Jaikin;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

class Draw extends JPanel {

    private Window window;

    public Draw(Window window) {
        this.window = window;
        Timer timer = new Timer(1000, e -> {
            this.repaint();
        });
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.white);
        g.drawString("Click to draw Point | Enter = Start | C = Clear | ESC = Exit ", 0, 15);
        g.setColor(Color.red);
        g.drawString("Attention: min points to start drawing is two points ", 0, 30);
        List<Point> oldPoints = window.getPoints();
        for (Point p : oldPoints) {
            g.setColor(Color.white);
            g.drawOval(p.getX(), p.getY(), 7, 7);
        }

        if (window.getIsStarted()) {
            g.setColor(Color.green);
            g.drawString(String.format("Step:%d", window.getSteps() + 1), 750, 15);
            List<Point> newPoints = window.getCurrPoints();
            if (window.getSteps() > 0) {
                newPoints = chaikinAlgo(newPoints, oldPoints.get(0), oldPoints.get(oldPoints.size() - 1));
                window.setCurrPoints(newPoints);
            }

            for (int i = 0; i < newPoints.size() - 1; i++) {
                Point p1 = newPoints.get(i);
                Point p2 = newPoints.get(i + 1);
                g.setColor(Color.GREEN);
                g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
            }
            window.incSteps();
            if (window.getSteps() > 6) {
                window.setSteps(0);
                window.setCurrPoints(oldPoints);
            }
        }
    }

    public List<Point> chaikinAlgo(List<Point> oldPoints, Point first, Point last) {
        List<Point> newPoints = new ArrayList<>();
        newPoints.add(first);

        for (int i = 0; i < oldPoints.size() - 1; i++) {
            Point p1 = oldPoints.get(i);
            Point p2 = oldPoints.get(i + 1);
            int qX = (int) (0.75 * p1.getX() + 0.25 * p2.getX());
            int qy = (int) (0.75 * p1.getY() + 0.25 * p2.getY());
            int rX = (int) (0.25 * p1.getX() + 0.75 * p2.getX());
            int ry = (int) (0.25 * p1.getY() + 0.75 * p2.getY());
            newPoints.add(new Point(qX, qy));
            newPoints.add(new Point(rX, ry));
        }

        newPoints.add(last);
        return newPoints;
    }
}
