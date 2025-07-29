package Awt;
import java.awt.*;

class myFrame extends Frame{

    public myFrame(){
        super("2nd Method for Button"); //THIS PASSED TO SUPERCLASS FRAME AND SETS THE NAME TO "2nd Method for Button".

        setLayout(new FlowLayout());


        Button b= new Button("Click me");
        Label l = new Label("Button2");
        TextField tf = new TextField(20);  // THIS (20) MEANS WHAT LENGTH OF TEXT BOX SHOULD WE SEEN ON SCREEN. not❌ mean that it can store only 20 value.

        add(l);
        add(b);
        add(tf);

    }
}
public class Buttons2 {
    public static void main(String[] args) {

        myFrame mf = new myFrame();
        mf.setSize(300,300);
        mf.setVisible(true);

    }
}
