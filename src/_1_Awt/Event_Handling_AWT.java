package _1_Awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

       //Event Handling in Awt

public class Event_Handling_AWT extends Frame{

    public Event_Handling_AWT() {

        //When we clicks button that the text of label changes

//        Label label=new Label("Enter Your Name:");
//        label.setBounds(20,40,200,30);
//        add(label);
//
//        Button button = new Button("Click Me");
//        button.setBounds(20, 120, 80, 30);
//        button.setBackground(Color.pink);
//        add(button);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText("Button Clicked Successfully");
//            }
//        });


        //When we clicks add button so we are adding label1 and label2 and assigning the addition in label2's textfield

        Label label=new Label("Enter the First Number:");
        label.setBounds(20,40,200,30);


        TextField textField=new TextField();
        textField.setBounds(20,80,100,30);
        textField.setBackground(Color.pink);


        Label label1=new Label("Enter the Second Number:");
        label1.setBounds(20,120,200,30);


        TextField textField1=new TextField();
        textField1.setBounds(20,160,100,30);
        textField1.setBackground(Color.pink);

//
        Label label2=new Label("Sum:");
        label2.setBounds(20,200,200,30);


        TextField textField2=new TextField();
        textField2.setBounds(20,240,100,30);
        textField2.setBackground(Color.pink);


            add(label);
            add(textField);
            add(label1);
            add(textField1);


        Button button = new Button("Add");
        button.setBounds(20, 280, 80, 30);
        button.setBackground(Color.pink);
        add(button);

        add(label2);
        add(textField2);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==button){
                    int num1=Integer.parseInt(textField.getText());
                    int num2=Integer.parseInt(textField1.getText());

                    textField2.setText(String.valueOf(num1+num2));
                }
            }
        });

        setLayout(null);
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Frame frame = (Frame) e.getSource();
                frame.dispose();
            }
        });
    }

        public static void main (String[]args){
          new Event_Handling_AWT();
        }

}
