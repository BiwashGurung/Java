import javax.swing.*;
import java.awt.*;

public class Grid {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JButton b1 = new JButton("button 1");
        JButton b2 = new JButton("button 2");
        JButton b3 = new JButton("button 3");
        JButton b4 = new JButton("button 4");
        JButton b5 = new JButton("button 5");
        JButton b6 = new JButton("button 6");
        JButton b7 = new JButton("button 7");
        JButton b8 = new JButton("button 8");
        JButton b9 = new JButton("button 9");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.setLayout(new GridLayout(3,3));



    }
}