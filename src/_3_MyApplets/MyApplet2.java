import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyApplet2 extends Applet implements ActionListener{

    TextField t1=new TextField(10);
    TextField t2=new TextField(10);
    TextField t3=new TextField(10);
    Label l1=new Label("Enter the First Number:");
    Label l2=new Label("Enter the Second Number");
    Label l3=new Label("Sum:");
    Button b=new Button("Add" );

    public void init(){
        setBackground(Color.pink);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
        add(t3);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
              if(e.getSource()==b){
                  int a=Integer.parseInt(t1.getText());
                  int b=Integer.parseInt(t2.getText());
                  t3.setText(String.valueOf(a+b));     //sets a+b value in sum's text field
              }
              repaint();
    }
}
