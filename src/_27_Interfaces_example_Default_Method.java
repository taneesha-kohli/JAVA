
abstract class phone1
{
    abstract void poweron();
    abstract void switchoff();
}
interface wifi
{
    void addnetwork();   //let many classes has derived this interface and we want a new method in all classes


   private void addindefault()
   {
       System.out.println("This method can't inherits in classes , but it is used to call in default function of interface if default " +
               "function has many content so we can add some content in private method then can call in default function");
   }
    default void wirelessnetwork()            //we defines default method inside the interface
    {
        addindefault();
        System.out.println("Connecting with wireless network");
    }
}
interface torch
{
    void ontorch();
}

interface music
{
    void playmusic();
}

    //interface example , with multiple inheritance of interface also extending class
 class smartphone extends phone1 implements wifi,torch,music
 {
     //method of phone1 class
     @Override
     void poweron() {
         System.out.println("Power on");
     }

     @Override
     void switchoff() {
         System.out.println("switching off");
     }

     //method of interface wifi

     @Override
     public void addnetwork() {
         System.out.println("adding network");
     }

     //method of interface torch
     @Override
     public void ontorch() {
         System.out.println("On torch");
     }

     //method of interface music
     @Override
     public void playmusic() {
         System.out.println("Playing music");
     }
 }

public class _27_Interfaces_example_Default_Method {
    public static void main(String[] args) {

        /*DEFAULT METHOD IN INTERFACE : let we have created a full program , now we want to add a new interface method , but
        then we will have to add that interface in all classes whose derived the that interfaces, for this in interface we creates
        a default interfaces method and implements that inside the interface now , that will available in all classes , with
        default definition which we have provided in interface
        */

        smartphone ob=new smartphone();
        ob.poweron();
        ob.switchoff();
        ob.addnetwork();
        ob.ontorch();
        ob.playmusic();
        ob.wirelessnetwork();
    }
}
