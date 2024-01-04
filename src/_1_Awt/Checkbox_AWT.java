package _1_Awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Checkbox_AWT extends Frame {
    public Checkbox_AWT(){


        Checkbox checkbox=new Checkbox("Java");
        checkbox.setBounds(40,40,50,30);
        Checkbox checkbox1=new Checkbox("Python");
        checkbox1.setBounds(40,60,50,30);

        add(checkbox);
        add(checkbox1);

        setLayout(null);
        setSize(500,500);
        setVisible(true);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Frame frame=(Frame)e.getSource();
                frame.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new Checkbox_AWT();
    }

}
