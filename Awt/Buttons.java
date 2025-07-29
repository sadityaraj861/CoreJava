package Awt;
import java.awt.*;

public class Buttons {
    static public void main(String[] args) {
        Frame f = new Frame("1st Program");
        f.setLayout(new FlowLayout());  // ENSURES THAT THE SIZES OF ALL BUTTON LABELS ARE STANDARD.

        Button b = new Button("CLICK  ME"); // CREATES BUTTON
        Label l = new Label("BUTTON1");
        TextField tf = new TextField(20);


        // Adding all Components into frame.
        f.add(b);
        f.add(l);
        f.add(tf);

        //Setting size of frame.
        f.setSize(300,300);
        f.setVisible(true); // MAKES SURES THAT OUR FRAME IS VISIBLE TO US.

    }
}
