
class cellphone
{
   void on()
   {
       System.out.println("Turning on phone");
   }
   void call()
   {
       System.out.println("Calling......");
   }
}
interface gps
{
 void run();
}
interface camera
{
   void capture();
}
interface mediaPlayer
{
    void music();
}

 class Smartphone extends cellphone implements gps,camera,mediaPlayer   //cellphone will inherit as it is but we will have to implement interfaces method

 {
     @Override
     public void run() {
         System.out.println("Running gps......");
     }

     @Override
     public void capture() {
         System.out.println("Capturing photos");
     }

     @Override
     public void music() {
         System.out.println("Playing music");
     }
 }

     /*Polymorphism mean one name multiple form , we know we can call all methods of all interface and classes in smartphone class
     because it is inheriting or implementing those , but we can create reference of those classes and interface and can create
      object of smartphone , as we saw in dynamic method dispatch, NOTE : we can take those reference but can call only it's function
      which are inherited or implemented in smartphone*/

public class _29_Polymorphism_In_Interface {
    public static void main(String[] args) {
        //we can do----
        gps ob=new Smartphone();     //through reference of gps's ob we can just call gps's method
        ob.run();

        camera ob1=new Smartphone();
        ob1.capture();

        cellphone ob2=new Smartphone();
        ob2.on();
        ob2.call();

        mediaPlayer ob3=new Smartphone();
        ob3.music();

        //WE CAN SEE SMARTPHONE PLAYING MANY ROLE WHICH IS KNOWN POLYMORPHISM



//        ob.music();           //music is method of mediaplayer so this is invalid, because music is not gps's function

        //always reference method executes , which we will take as reference

        /*so here smartphone is just single class , but playing many role , if we will take gps reference so it's working of gps
        if we will use reference of camera so smartphone will work as camera , same for media player , one smarthone but having functionality
        of gps,camera mediaplayer , this list can be increasing , by adding more interfaces
         */
    }
}
