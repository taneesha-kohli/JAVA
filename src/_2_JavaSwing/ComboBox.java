package _2_JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    JFrame jFrame;
     public ComboBox(){
         jFrame = new JFrame();
         jFrame.setTitle("ComboBox");

         String cityname[] ={"Mumbai","Surat","Goa","Udaypur"};

        JComboBox jComboBox=new JComboBox(cityname);
        jComboBox.setBounds(100,20,100,20);

         JButton jButton=new JButton("click");
         jButton.setBounds(100,150,80,30);

         JLabel jLabel=new JLabel();
         jLabel.setBounds(100,50,200,30);

         jFrame.add(jButton);
         jFrame.add(jComboBox);
         jFrame.add(jLabel);

         jButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 jLabel.setText("You selected this city : "+jComboBox.getItemAt(jComboBox.getSelectedIndex()));
             }
         });

         jFrame.setLayout(null);
         jFrame.setSize(500, 500);
         jFrame.setVisible(true);

         jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
     }

    public static void main(String[] args) {
        new ComboBox();
    }

}
