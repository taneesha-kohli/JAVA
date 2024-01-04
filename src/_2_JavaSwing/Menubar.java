package _2_JavaSwing;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Menubar implements ActionListener {

    JMenuBar jMenuBar;
    JMenu file,edit,format,submenu;
    JMenuItem cut,copy,paste,save,exit,zoom,delete,check;
    JTextArea jTextArea;

    public Menubar(){

        JFrame jFrame=new JFrame("Menu");

        jTextArea=new JTextArea();
        jTextArea.setBounds(5,5,599,599);

        jMenuBar=new JMenuBar();

        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");

        save=new JMenuItem("save");
        exit=new JMenuItem("exit");

        zoom=new JMenuItem("zoom");

        delete=new JMenuItem("delete");
        check=new JMenuItem("check");


        cut.addActionListener(this);
       copy.addActionListener(this);
       paste.addActionListener(this);

       exit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int a=JOptionPane.showConfirmDialog(jFrame,"Do You want to exit");
               if(a == JOptionPane.YES_OPTION){
                   jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
               }

           }
       });

        file=new JMenu("file");
        file.add(save);
        file.add(exit);

        edit=new JMenu("edit");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        format=new JMenu("format");
        format.add(zoom);

        submenu=new JMenu("submenu");
        file.add(submenu);

        submenu.add(delete);
        submenu.add(check);

        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(format);

        jFrame.add(jTextArea);
        jFrame.add(jMenuBar);
    jFrame.setJMenuBar(jMenuBar);



        jFrame.setLayout(null);
        jFrame.setSize(600,600);;
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int a=JOptionPane.showConfirmDialog(jFrame,"Do You want to exit");
                if(a ==JOptionPane.YES_OPTION){
                    jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
                }
            }
        });
        jFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() ==cut){
         jTextArea.cut();
     }
     if(e.getSource() ==copy){
         jTextArea.copy();
     }
     if(e.getSource() ==paste){
         jTextArea.paste();
     }

    }

    public static void main(String[] args) {
        new Menubar();
    }

}
