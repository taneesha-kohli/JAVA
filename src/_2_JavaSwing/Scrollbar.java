package _2_JavaSwing;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Scrollbar {

    public Scrollbar(){

        JFrame jFrame=new JFrame("Scrollbar");

        JLabel jLabel=new JLabel();
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        jLabel.setSize(400,400);

        JScrollBar jScrollBar=new JScrollBar();
        jScrollBar.setBounds(100,100,15,200);

        jScrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                jLabel.setText("Your position is " + jScrollBar.getValue());
            }
        });

       jFrame.add(jLabel);
       jFrame.add(jScrollBar);



        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Scrollbar();
    }
}
