package _2_JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password_Field {

    JFrame jFrame;
    JLabel jLabel;

    public Password_Field(){
        jFrame=new JFrame();
        jFrame.setTitle("Password field");

        jLabel=new JLabel("Password");
        jLabel.setBounds(40,10,250,20);

        JPasswordField jPasswordField=new JPasswordField();
        jPasswordField.setBounds(150,10,100,20);

        JButton jButton=new JButton("check");
        jButton.setBounds(20,70,100,20);

        jFrame.add(jLabel);
        jFrame.add(jPasswordField);
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jPasswordField.getText());     //when we will click the button so we want that get text to password and set it to in label
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Password_Field();
    }
}
