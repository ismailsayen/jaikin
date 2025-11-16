package Jaikin;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListner extends Window implements KeyListener {
public void keyPressed(KeyEvent e) {
        System.out.println("=>" + e);
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
