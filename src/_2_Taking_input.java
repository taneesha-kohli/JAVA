//import java.util.Scanner;
//public class _2_Taking_input {
//    public static void main(String[] args) {
//        System.out.println("it works");
//   Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a=sc.nextInt();
//        System.out.println("Enter number 2");
//        int b=sc.nextByte();
//        System.out.println("value of a "+a);
//        System.out.println("value of b "+b);
//        int sum=a+b;
//        System.out.println("sum of a and b is : "+sum);
//        System.out.println("Enter a float number : ");
//        float f=sc.nextFloat();
//        System.out.println("Your entered float number is :"+f);
//
//        System.out.println("Enter a number :");
//
//        boolean b1=sc.hasNextInt();   //by using this we will check user entered number is integer or not, if it is integer so we will get true
//        System.out.println(b1);
//
//        System.out.println("Enter a string :");    //used to take a single string as a input
//        String stt=sc.next();
//        System.out.println(stt);
//
//        System.out.println("Enter a long string");     //used to take a long string with space
//        String st2=sc.nextLine();
//        System.out.println(st2);
//
//    }
//}

import java.util.Scanner;

public class _2_Taking_input {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          int a= 34;
          System.out.println(a);
          System.out.println("Enter a number");
          int b=ob.nextInt();
          System.out.println(b);

          System.out.println("Enter an integer number ");
          int i=ob.nextInt();
          System.out.println(i);
          System.out.println("Enter an string ");
          String str=ob.next();
          System.out.println(str);
          System.out.println("Enter an long string");
          String str1 = ob.nextLine();
          System.out.println(str1);
          System.out.println("Enter an float number");
          float f=ob.nextFloat();
          System.out.println(f);


     }

}

