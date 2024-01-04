import java.applet.*;
import java.awt.*;

public class MyApplet3 extends Applet {
//    public void init(){
//        setBackground(Color.pink);
//        setForeground(Color.cyan);
//    }
    public void paint(Graphics g){
Image pic=getImage(getCodeBase(),"woman.webp");
        g.drawImage(pic,100,100,this);
    }

}
