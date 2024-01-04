//import java.util.Scanner;
//
//public class _3_Percentage_calculate {
//    public static void main(String[] args) {
//        Scanner ob=new Scanner(System.in);
//        float total;
//        float percentage;
//        int m1,m2,m3,m4,m5;
//        System.out.println("Enter your subjects marks :");
//        m1=ob.nextInt();
//        m2=ob.nextInt();
//        m3=ob.nextInt();
//        m4=ob.nextInt();
//        m5=ob.nextInt();
//        total=m1+m2+m3+m4+m5;
//        percentage=total/5;
//        System.out.println("Your total marks : "+total);
//        System.out.println("Your percentage : "+percentage);
//
//    }
//}
//
//

import java.util.Scanner;

public class _3_Percentage_calculate {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int total;
        float percentage;
        int m1,m2,m3,m4,m5;
        System.out.println("Enter your subjects marks :");
        m1=ob.nextInt();
        m2=ob.nextInt();
        m3=ob.nextInt();
        m4=ob.nextInt();
        m5=ob.nextInt();
        total=m1+m2+m3+m4+m5;
        percentage=(float)total/5;
        System.out.println("Your total marks : "+total);
        System.out.println("Your percentage : "+percentage);

    }
}


