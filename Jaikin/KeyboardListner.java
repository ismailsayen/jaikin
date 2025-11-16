package Jaikin;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
                if (window.getPoints().size() == 0) {
                    return;
                }
                window.setIsStarted(true);

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
