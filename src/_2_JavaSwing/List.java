package _2_JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class List {
 JFrame jFrame;
    public List(){
  jFrame=new JFrame("List");

  JLabel jLabel=new JLabel();
  jLabel.setBounds(40,10,250,30);

  JButton jButton=new JButton("Selected Items");
  jButton.setBounds(100,50,150,30);

    DefaultListModel<String> l1 =new DefaultListModel<String>();
    l1.addElement("Shivani");
    l1.addElement("Tanisha");
    l1.addElement("Shreya");
    l1.addElement("Saloni");
    l1.addElement("Sonali");

    DefaultListModel<String> l2=new DefaultListModel<String>();
        l2.addElement("Aswal");
        l2.addElement("Kohli");
        l2.addElement("Rana");
        l2.addElement("Rawat");
        l2.addElement("Chamoli");


    JList name=new JList(l1);
    name.setBounds(100,100,75,95);

    JList surname=new JList(l2);
    surname.setBounds(100,200,75,95);


    jFrame.add(jLabel);
    jFrame.add(jButton);

    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String data = "Name : "+name.getSelectedValue() + "  Surname : "+surname.getSelectedValue();
            jLabel.setText(data);

        }
    });

    jFrame.add(name);
    jFrame.add(surname);

        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new List();
    }
}
