import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int marks[]=new int[5];
        int total=0;
        float percentage;
       for(int i=0;i<5;i++)
       {
           System.out.println("Enter your "+(i+1)+" subject marks");
           marks[i]=ob.nextInt();
           total=total+marks[i];
       }

        System.out.println("Total Marks: "+ total);
       percentage=(float)total/5;
        System.out.println("Percentage : "+ percentage);
    }
}
