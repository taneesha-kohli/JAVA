public class _16_Recursion {

    /*Printing Numbers*/
//    static void func(int a1)
//    {
//        if(a1>10)
//        {
//            return;
//        }
//        System.out.println(a1);
//        func(a1+1);
//    }


    /*Printing Sum*/
//    static int sum(int i)
//    {
//        int result=0;
//          if(i>10)
//          {
//              System.out.println("Sum : "+ i);
//            return i;
//          }
//        return result=i+sum(i+1);
//    }

    /*Printing Factorial*/
    static int factorial(int n)
    {
        int fact;
       if(n==1||n==0)
       {
           return 1;
       }
       return fact=n*factorial(n-1);
    }

    public static void main(String[] args) {
//        func(1);
//        System.out.println( sum(1));
        System.out.println("Factorial of 5 :"+factorial(5));
    }
}
