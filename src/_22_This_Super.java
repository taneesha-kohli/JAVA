
     /*This keyword*/

     class myclass
     {
         private int a;
         myclass(int a)
         {
             this.a=a;         //this.a is equivalent to a of object which we are creating , object.a
             System.out.println("this is constructor with argument of base class");
         }
         int getA()
         {
             return this.a;
         }
     }

     /*Super Keyword*/
     class myderived extends myclass
     {
         myderived()     //when i'm creating default constructor so error is showing , that there is no default constructor in base
         {
             super(5);    //so we will call argument constructor of base class using super ,
             System.out.println("this is default constructor of derived class");
         }
     }


public class _22_This_Super {
    public static void main(String[] args) {
        myderived ob=new myderived();
    }
}
