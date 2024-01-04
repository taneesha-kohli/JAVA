import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyApplet1 extends Applet implements ActionListener{
 String str=" ";
    TextField t1=new TextField(10);
 TextField t2=new TextField(3);
 Label l1=new Label("Enter Your Name:");
 Label l2=new Label("Enter Your Age:");
  Button b=new Button("Ok");
  Button b1=new Button("Submit:");

  public void init(){
      add(l1);
      add(t1);
      add(l2);
      add(t2);
      add(b);
      add(b1);
      b.addActionListener(this);
      b1.addActionListener(this);
  }
  public void paint(Graphics g){
      g.drawString(str,40,40);
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            str="Ok is Clicked";
        }
        if(e.getSource()==b1){
            str="Submit is Clicked";
        }
        repaint();
    }
}
