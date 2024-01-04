//
//class Phone
//{
//  void on()
//  {
//      System.out.println("Turning on Phone");
//  }
//  void showtime()
//  {
//      System.out.println("Time is 2AM");
//  }
//}
//class SmartPhone extends Phone
//{
//    void on()
//    {
//        System.out.println("Turning on SmartPhone");
//    }
//    void showtime()
//    {
//        System.out.println("Time is 5PM");
//    }
//    void music()     //music can invoke just by smartphone reference and object
//    {
//        System.out.println("Playing music");
//    }
//}
//public class _24_Dynamic_Method_Dispatch {
//    public static void main(String[] args) {
//
//        //we can create object of derived class with reference of base class
//        //here method invocation decides in runtime , that's why it is known as dynamic method dispatch
//        //NOTE : using new keyword object creation performs in runtime
//
//        Phone ob=new SmartPhone();      //this is allowed
//        ob.on();
//        ob.showtime();
////        ob.music() ;          //this is not allowed , because music doesn't exists in smartphone class
//
//      //  SmartPhone ob1 = new Phone();    //this is not allowed
//
//
//        // NOTE : but we can call using smartphone ob only that method which exists in phone class , using ob we can call just on and showtime
//
//        /*NOTE : always which object is creating that function invokes , so on and showtime will invoke of smartphone not phone
//        because phone ob is just referenced actual object is creating of smartphone class , so with ob smartphone class's on and showtime
//        will invoke
//         */
//    }
//}


  class random
  {
      void greet()
      {
          System.out.println("Good morning");
      }
  }

  class derivedrandom extends random
  {
      void greet()
      {
          System.out.println("good night");
      }
  }

public class _24_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
     random ob= new derivedrandom();
     ob.greet();

//     derivedrandom ob1=new random();
     /* NOTE:
     we were able to do random ob = new derivedrandom because random class's method was inheriting in derivedrandom , but because
     in random we didn't inherit any class of derived so we are anable to do derivedrandom ob1= new random
      */

    }
}