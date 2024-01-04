package _2_JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton implements ActionListener {
    JFrame jFrame;
    JRadioButton jRadioButton1,jRadioButton2;
    public RadioButton(){
        jFrame=new JFrame("RadioButton");

        jRadioButton1=new JRadioButton("Male");
        jRadioButton1.setBounds(100,50,100,30);

        jRadioButton2=new JRadioButton("Female");
        jRadioButton2.setBounds(100,100,100,30);

        JButton jButton=new JButton("Click");
        jButton.setBounds(100,150,80,30);

        jFrame.add(jRadioButton1);
        jFrame.add(jRadioButton2);
        jFrame.add(jButton);

        jButton.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(jRadioButton1.isSelected())
    {
        JOptionPane.showMessageDialog(jFrame,"You are  Male");
       jRadioButton2.setSelected(false);
    }
   else if(jRadioButton2.isSelected()){
        JOptionPane.showMessageDialog(jFrame,"You are Female");
     jRadioButton1.setSelected(false);
    }
    }

    public static void main(String[] args) {
        new RadioButton();
    }


}
