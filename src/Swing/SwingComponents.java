package Swing;
import javax.swing.*;

public class SwingComponents {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton btn = new JButton("click me");
        btn.setBounds(5,10,2,5);
        frame.add(btn);
        frame.setSize(400,500);
        frame.setVisible(true);

        JLabel label = new JLabel("JFrame By Example");
        frame.add(label);
    }
}
