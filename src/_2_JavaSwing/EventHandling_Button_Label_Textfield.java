package _2_JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling_Button_Label_Textfield implements ActionListener {
    public JFrame jFrame;
   public  JLabel jLabel;
   public JTextField jTextField;
   public JButton jButton;
   public JTextArea jTextArea;

    public EventHandling_Button_Label_Textfield(){
        jFrame=new JFrame("My First Java Swing Frame");

//        jButton=new JButton("Click");
//        jButton.setBounds(60,40,80,30);
////
//         jLabel =new JLabel("This Is My First Lable");
//        jLabel.setBounds(60,90,200,30);
//
//        jTextField=new JTextField();
//        jTextField.setBounds(60,140,150,30);

        jTextArea=new JTextArea();
        jTextArea.setBounds(60,40,200,200);
        jTextArea.setBackground(Color.LIGHT_GRAY);

        jButton =new JButton("Click");
        jButton.setBounds(80,280,80,30);

        jLabel=new JLabel("");
        jLabel.setBounds(60,10,250,20);
    jLabel.setBackground(Color.pink);


        jFrame.add(jButton);
        jFrame.add(jTextArea);
        jFrame.add(jLabel);
        jButton.addActionListener(this);


//        jFrame.add(jButton);
//        jFrame.add(jLabel);
//        jFrame.add(jTextField);


//        jButton.addActionListener(this);

//        jButton.addActionListener(new ActionListener() {    //when we are creating this method inside the constructor
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jLabel.setText("Have a Good Day :)");
//                jLabel.setForeground(Color.pink);
//                jTextField.setText("Have a Good Day :)");
//                jTextField.setBackground(Color.pink);
//                jTextField.setForeground(Color.white);
//            }
//        });

        jFrame.setLayout(null);                     //Frame property should be in end
        jFrame.setSize(600,400);
        jFrame.setVisible(true);            //setVisible should be in end

      jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);     //this says if we close window so process should be terminated
    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//                jLabel.setText("Have a Good Day :)");
//                jLabel.setForeground(Color.pink);
//                jTextField.setText("Have a Good Day :)");
//                jTextField.setBackground(Color.pink);
//                jTextField.setForeground(Color.white);
//    }


    @Override
    public void actionPerformed(ActionEvent e) {
       String text=jTextArea.getText();     //by this we will fetch total character
        String word[]=text.split(" ");   //this will fetch total word
       jLabel.setText("Total Char : "+text.length() + "  Total Words : "+ word.length);     //this will set total character and words in Label, when we will click to the button

    }


    public static void main(String[] args) {
        new EventHandling_Button_Label_Textfield();
    }


}
