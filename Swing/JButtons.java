package Swing;

import javax.swing.*;
import java.awt.*;

public class JButtons {
    public static void main(String[] args) {
        JFrame jf = new JFrame("1st Swing App");
        JButton jb = new JButton("Click me ");
        JLabel jl = new JLabel("Hello");

        jb.setBounds(150,70,100,30);
        jl.setBounds(115,80,30,10);

        jf.add(jb);
        jf.add(jl);

        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);

    }
}
