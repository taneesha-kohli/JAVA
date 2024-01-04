package _2_JavaSwing;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OptionPane {

    public OptionPane(){
   //By using option pane we can show any message on popup box

        JFrame jFrame=new JFrame("Option Pane");

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                //by using joptionpane.showconfirmdialog we can popup yes no cancel dialog box

                int a=JOptionPane.showConfirmDialog(jFrame,"Do you want to exit?");
                if(a == JOptionPane.YES_OPTION){
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new OptionPane();
    }
}
