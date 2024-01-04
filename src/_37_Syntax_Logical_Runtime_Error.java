import java.util.Scanner;

public class _37_Syntax_Logical_Runtime_Error {
    public static void main(String[] args) {

        /*SYNTAX ERROR : syntax error is that when we did mistake on syntax, like missed ; didn't specify data type and so on*/

//         int a=0                     ; is missing
//         b=9                         data type is missing
//         System.ou.println();        ou place of out

        /*LOGICAL ERROR : when we did mistake in logic of program so we will not get accurate result , our program can give
        unwanted result
        */

          //like we want to print sum of n numbers let 1 to 5
//           int n=5,sum=0;
//           for(int i=1;i<n;i++)                     //sum should be : 1+2+3+5 =11
//           {
//               sum=i+i;                      //like we did this
//           }
//        System.out.println(sum);

           //but we are getting 8 which is wrong , so when we don't use correct logic so we didn't get desired result


        /*RUNTIME ERROR : when error occurs on runtime , it means user has entered wrong value as input*/

//           int a=100;
//        Scanner ob=new Scanner(System.in);
//        System.out.println("Enter a integer number");
//        int num=ob.nextInt();
//        System.out.println(a/num);

        //we will get accurate result in all cases but when user enters 0 so this would be a arithmetic exception , to devide
//        any number by 0 , so this is runtime error when we are not aware which value user will enter , if entered value
//        isn't correct so we will get an error may be our program can crash
    }
}
