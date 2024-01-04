import java.util.Scanner;

public class _40_Nested_try_catch {
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=45;
        arr[1]=56;
        arr[2]=76;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter The value of index");
        int ind=ob.nextInt();

   /*as we use nested try catch , which try block will met to exception that catch block will execute */


        try
        {
//            System.out.println(arr[ind]/0);
            System.out.println("This is level 1");

            try
            {
                System.out.println(arr[ind]);
            }
            catch (ArrayIndexOutOfBoundsException er)
            {
                System.out.println("Array index out of bound exception occured");
                System.out.println(er);
                System.out.println("Exception in level 2");

            }

        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
            System.out.println("Exception in level 1");
        }

    }
}
