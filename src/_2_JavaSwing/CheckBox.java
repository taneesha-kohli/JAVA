package _2_JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox implements ActionListener {
    JFrame jFrame;
    JCheckBox checkBox1, checkBox2, checkBox3;           //we will use 3 checkboxes

    public CheckBox() {
        jFrame = new JFrame();
        jFrame.setTitle("Checkbox");

        JLabel jLabel = new JLabel("Food Billing");
        jLabel.setBounds(50, 50, 300, 20);

        checkBox1 = new JCheckBox("Pizza 100");
        checkBox1.setBounds(100, 100, 150, 20);
        checkBox2 = new JCheckBox("Burger 100");
        checkBox2.setBounds(100, 150, 150, 20);
        checkBox3 = new JCheckBox("Tea 30");
        checkBox3.setBounds(100, 200, 150, 20);

        JButton jButton = new JButton("Total",new ImageIcon("C:\\Users\\Shivani\\Pictures\\Images\\App.jpg"));


        jButton.setBounds(100, 250, 80, 30);

        jFrame.add(jLabel);
        jFrame.add(checkBox1);
        jFrame.add(checkBox2);
        jFrame.add(checkBox3);
        jFrame.add(jButton);

        jButton.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";

        if (checkBox1.isSelected()) {
            amount += 100;         //amount=amount+100
            msg += " Pizza 100\n";      //msg=msg+Pizza 100
        }
        if (checkBox2.isSelected()) {
            amount += 100;
            msg += " Burger 100\n";
        }
        if (checkBox3.isSelected()) {
            amount += 35;
            msg += " Tea 35\n";
        }
          msg+="===========\n";
        JOptionPane.showMessageDialog(jFrame, msg+ " Total " +amount);     //this Shows new popup window
    }


    public static void main(String[] args) {
        new CheckBox();
    }
}



