package Swing;
import java.awt.event.*;
import javax.swing.*;
public class JButtonActionListener {
    public static void main(String[] args) {
        JFrame f = new JFrame("BUTTON ACTION LISTENER");
        JButton b = new JButton("CLICK ME");
        JTextField tf = new JTextField(40);

        tf.setBounds(60,100,120,40);
        b.setBounds(200,100,100,30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("BUTTON CLICKED");
            }
        });

        f.add(b);
        f.add(tf);

        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}