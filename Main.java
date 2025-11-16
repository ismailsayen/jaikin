import chaikin.Chaikin;

import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chaikin Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Chaikin());
        frame.setSize(1000, 800);
        frame.setVisible(true);
    }
}
