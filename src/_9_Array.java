//import java.util.Scanner;
//
//public class _9_Array {
//    public static void main(String[] args) {
//
//        int [] marks = new int[5];
////        marks[0] = 67;
////        marks[1] = 78;
////        marks[2] = 88;
////        marks[3] = 90;
////        marks[4] = 90;
////        System.out.println(marks[0]);
//        Scanner ob = new Scanner(System.in);
//        for (int i=0;i<5;i++)
//        {
//            System.out.println("Enter element "+ (i+1));
//            marks[i]=ob.nextInt();
//        }
//
//        for (int i=0;i<5;i++)
//        {
//            System.out.println(marks[i]+ "\t");
//        }
//
//    }
//}

import java.util.Scanner;

public class _9_Array {
    public static void main(String[] args) {

//    int arr[]={3,5,5,2};
//    for(int i=0;i<arr.length;i++)
//    {
//        System.out.println(arr[i]);
//    }

//        int arr[] = new int[5];       //we can dinamically store array using new
//        arr[0]=23;
//        arr[1]=44;
//        arr[2]=65;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        int arr[] = new int[5];
        Scanner ob = new Scanner(System.in);   //using scanner
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter element "+(i+1));
            arr[i]=ob.nextInt();
        }
        System.out.println("\n");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
