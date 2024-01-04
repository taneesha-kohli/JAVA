import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        /*1.  Sum of 3 numbers */
//        int a=23,b=45,c=56;
//        int sum=a+b+c;
//        System.out.println("sum : "+sum);


        /*2. CGPA calculating ----- cgpa is grade out of 10 */

//        int marks1=45,marks2=67,marks3=77;
//        float percentage=(float)(marks1+marks2+marks3)/3;            //it will give average out of 100 marks
//        float cgpa=(float)(marks1+marks2+marks3)/30;                //this will give average out of 10
//        System.out.println("Percentage : "+ percentage);
//        System.out.println("Cgpa : "+ cgpa);


        /*3. Km to Miles    1km = 0.624 miles*/

//        int km;
//        Scanner ob=new Scanner(System.in);
//        System.out.println("Enter values in km : ");
//        km=ob.nextInt();
//        System.out.println(km*0.62 + " Miles");


        /*4. detect user entered number is integer or not*/

        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(ob.hasNextInt());


    }
}
