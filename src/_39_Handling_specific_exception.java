import java.util.Scanner;

public class _39_Handling_specific_exception {
    public static void main(String[] args) {
        //if we have multiple exceptions in our code so how we will handle those , let we takes 2 exception

        int arr[]=new int[3];
        arr[0]=45;
        arr[1]=56;
        arr[2]=98;

        System.out.println("Enter index with you want to divide");
        Scanner ob=new Scanner(System.in);
        int ind=ob.nextInt();

        System.out.println("Enter the number by which you want to divide");
        int num=ob.nextInt();

        //there 2 exception can occur first is user enteres array out of index lets 8 10 , but array last index is 2
//        so this will give ArrayIndexOutOfBoundsException
//        second if user enteres number to 0 so this will fetch arithmetic exception

//                   without try catch

//        System.out.println(ind);
//        System.out.println(ind/num);

//        with try catch

         try
         {
             System.out.println(arr[ind]);
          System.out.println(arr[ind]/num);
         }
         catch (ArithmeticException e)
         {
             System.out.println("ArithmeticException occured");
             System.out.println(e);
         }
         catch (ArrayIndexOutOfBoundsException e)
         {
             System.out.println("ArrayIndexOutOfBoundsException Occured");
             System.out.println(e);
         }
         catch (Exception e)
         {
             System.out.println("some other exception occured");
             System.out.println(e);
         }

    }
}
