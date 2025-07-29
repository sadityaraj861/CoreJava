package Awt;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{

    int count = 0;
    Label l ;
    Button b ;
    public MyFrame(){
        super("BUTTON DEMO");

        l = new Label("   "+count);
        b = new Button("CLICK ME");
        b.addActionListener(this);  //ye is class ke andar hone wale sare buttom se hone wale event ko handle krega : pass krega
        //actionPerformed(ActionEvent e){ } ko aur perform krwayega to andar diya gya hai .
        setLayout(new FlowLayout());
        add(l);
        add(b);

    }


    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("   "+count);
    }


}
public class ButtonActionListeners {
    public static void main(String[] args) {

        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}


