package _1_Awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//public class MyAwt1 {


public class Label_Textfield_AWT extends Frame {

//    Code when we are extending the Frame class

    public Label_Textfield_AWT(){

        Label label=new Label("Enter Your Name:");
        label.setBounds(20,40,100,30);
        add(label);

        TextField textField=new TextField();
        textField.setBounds(20,80,100,30);
        textField.setBackground(Color.pink);
        add(textField);

        Button button=new Button("Click Me");
        button.setBounds(20,120,80,30);
        button.setBackground(Color.pink);
        add(button);

        TextArea textArea=new TextArea();
        textArea.setBounds(200,40,200,200);
        add(textArea);


        setLayout(null);
        setSize(400,400);
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

        //If We want to  run our frame through main, so as first by declaring frame object we can use it's all method anywhere


//        Frame frame=new Frame();
//        Label label=new Label("Enter Your Name:");
//        label.setBounds(20,40,100,30);
//        frame.add(label);
//
//        TextField textField=new TextField();
//        textField.setBounds(20,80,100,30);
//        textField.setBackground(Color.pink);
//        frame.add(textField);
//
//        Button button=new Button("Click Me");
//        button.setBounds(20,120,80,30);
//        button.setBackground(Color.pink);
//        frame.add(button);
//
//
//        frame.setLayout(null);
//        frame.setSize(400,400);
//        frame.setVisible(true);
//
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                Frame frame=(Frame)e.getSource();
//                frame.dispose();
//            }
//        });


        new Label_Textfield_AWT();    //When we are using frame through constructor so we will have to declare object of class
    }


}




//Code When we are using frame class by creating it's object



//        Frame frame=new Frame("My First Awt GUI");
//
//
//        Label label=new Label("Enter Your Name :");
//        label.setBounds(20,40,100,30);
//        frame.add(label);
//
//        TextField textField=new TextField(10);
//        textField.setBounds(20,80,100,30);
//        textField.setBackground(Color.pink);
//        frame.add(textField);
//
//
//        Button button=new Button("Click Me");
//        button.setBounds(20,120,80,30);    //sets button width height and x and y coordinates
//        button.setBackground(Color.pink);
//        button.setForeground(Color.white);
//        frame.add(button);
//
//        frame.setSize(400,300);    //Method of frame , to initialise the size of frame
//        frame.setLayout(null);    //it sets the component on that actual size , if we will not include this , so component(like-button) will take full size of frame
//        frame.setVisible(true);        //Method of frame which sets the frame,because we extends frame class that's why we can use it's method
//
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                frame.dispose();
//            }
//        });
//    }
//    public static void main(String[] args) {
//     MyAwt1 m=new MyAwt1();
//
//    }





          //When we implements WindowListener , so we implements all methods , and we can set our frame like this


//    public MyAwt1() {
//        Frame frame = new Frame();
//        frame.setLayout(null);
//        frame.setVisible(true);
//        frame.setSize(500,500);
//        frame.addWindowListener(this);
//    }
//
//    //All Methods of WindowListener  , we can implement those like this , it just shows what our frame is performing
//
//        @Override
//        public void windowOpened (WindowEvent e){
//            System.out.println("Window is opened");
//        }
//
//        @Override
//        public void windowClosing (WindowEvent e){
//            Frame frame = (Frame) e.getSource();
//            frame.dispose();
//
//        }
//
//        @Override
//        public void windowClosed (WindowEvent e){
//            System.out.println("Window is closed");
//
//        }
//
//        @Override
//        public void windowIconified (WindowEvent e){
//            System.out.println("windowIconified");
//        }
//
//        @Override
//        public void windowDeiconified (WindowEvent e){
//            System.out.println("windowDeiconified");
//        }
//
//        @Override
//        public void windowActivated (WindowEvent e){
//            System.out.println("Window is activated");
//        }
//
//        @Override
//        public void windowDeactivated (WindowEvent e){
//            System.out.println("Window is deactivated");
//        }







