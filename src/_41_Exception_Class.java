import java.util.Scanner;


/*By using throw keyword or exception class we can use user defined exception , we can create our defined exception as we want */

class MyException extends Exception
{
    @Override
    public String toString() {
        return "Please enter number less than 10";
    }

    @Override
    public String getMessage() {
        return "New Exception occured";
    }
}

class AgeException extends Exception
{
    @Override
    public String getMessage() {
        return "Age Exception occured";
    }

    @Override
    public String toString() {
        return "Please enter a valid age upto 120";
    }
}

public class _41_Exception_Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num=sc.nextInt();
//
//            if (num > 10) {
//                try {
//
//                    throw new MyException();
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                    System.out.println(e.toString());
//                }
//            }
//         else
//            {
//                System.out.println("Your entered number :"+num);
//
//
//        }
        System.out.println("Enter your age :");
        int age=sc.nextInt();

        if(age>121)
        {
            try
            {
                throw  new AgeException();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
        else
        {
            System.out.println("Your age :"+age);
        }

    }
}
