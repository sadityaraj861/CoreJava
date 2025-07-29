package Awt;

import java.awt.*;

class MyFrame1 extends Frame{

    Button b1,b2,b3,b4,b5,b6;

    public MyFrame1(){
        super("FLOW LAYOUT");
        b1 = new Button("BUTTON 1");
        b2 = new Button("BUTTON 2");
        b3 = new Button("BUTTON 3");
        b4 = new Button("BUTTON 4");
        b5 = new Button("BUTTON 5");
        b6 = new Button("BUTTON 6");

        FlowLayout f1 = new FlowLayout();
        f1.setAlignment(FlowLayout.LEFT);
        setLayout(f1);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
public class ButtonFlowLayout {
    public static void main(String[] args) {
        MyFrame1 f1 = new MyFrame1();
        f1.setSize(400,400);
        f1.setVisible(true);
    }
}
