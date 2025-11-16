package Jaikin;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class KeyboardListner implements KeyListener {
    private Window window;

    public KeyboardListner(Window window) {
        this.window = window;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case 27:
                window.getFrame().setVisible(false);
                System.exit(0);
                break;
            case 10:
                if (window.getPoints().size() < 2) {
                    return;
                }
                window.setIsStarted(true);
                break;
            case 67:
                List<Point> newPoints = new ArrayList<>();
                window.setCurrPoints(newPoints);
                window.setPoints(newPoints);
                window.setSteps(0);
                window.setIsStarted(false);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
