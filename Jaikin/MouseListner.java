package Jaikin;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListner implements MouseListener {
    private Window window;

    public MouseListner(Window window) {
        this.window = window;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!window.getIsStarted() && e.getButton()==1) {
            Point p = new Point(e.getX(), e.getY());
            window.getPoints().add(p);
            window.setCurrPoints(window.getPoints());
        }
        window.getFrame().repaint();
    }



    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
