import java.util.Scanner;

      /*finally block is that which executes even the program is terminated , we break the loop , we return the function
        so in this case program execution stops doesn't matter what is that , but only finally block executes
                  */


class myfinally
        {
           int value()
           {
               try
               {
                   int c=5/8;
                   return c;         //here this function will return from here , execution will not go forward , but even finally block is
               }                    //executing
               catch (Exception e)
               {
                   System.out.println(e);
               }
               finally {
                   System.out.println("This is finally block inside the external function of external class");
               }
               return 0;
           }
        }


public class _43_Finally_block {

    public static void main(String[] args) {
//        int a=9;
//        Scanner ob=new Scanner(System.in);
//
//        while(true)
//        {
//            System.out.println("Enter a number");
//            int num=ob.nextInt();
//          try
//          {
//              System.out.println(a/num);      //will through an exception in case num=0 that time catch block will execute and will break the loop
//          }
//          catch (Exception e)
//          {
//              System.out.println(e);
//              break;                  //when arithmetic exception will occur when 0 will enter , so catch block will execute
//                                     //and then break is used so while loop will terminate , and program execution will stop,
//          }
//          finally {
//              System.out.println("This is finally block");   //but after breaking the program , finally block will execute
//                                                            //finally block executes in any case, even the program has been terminated
//          }
//
//            System.out.println("this is inside of while loop");
//
//        }

        myfinally mf=new myfinally();
        System.out.println("returned value from function value() : = "+mf.value());
    }
}
