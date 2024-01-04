//public class _13_Static_Method {
//
////    int func(int a1, int b1)
////    {
////       int c1=a1+b1;
////       return c1;
////    }
//    static int func(int a1, int b1)
//    {
//    int c1=a1+b1;
//    return c1;
//    }
//    public static void main(String[] args) {
//
//        /*Methods are functions which would wrapped inside the class, method are used to reduce repetition , we call method
//        for same functionality*/
//
//        int a=4,b=6;
//
//        /* if we want add a and b many times so we can just call function */
//       // _13_Static_Method ob=new _13_Static_Method();
//       // int sum=ob.func(a,b);           //a and b will copy in a1 and in b1
//
//       /*Note :    we will have to need to create an object of class to access it's methods
//        */
//
//
//        /*we can also easily access the method by declaring that method static */
//
//        int sum=func(a,b);
//        System.out.println(sum);
//    }
//}


class basic
{
    public void print2()
    {
        System.out.println("How are you");
    }
    public void print1()
    {
        System.out.println("Hello world");
        print2();
    }
}
public class _13_Static_Method {

    static public void prints()
    {
        System.out.println("This is method of main class");
    }
    public static void main(String[] args) {
       basic ob=new basic();
       ob.print1();
       prints();    //we can call static method in static method without creating object , that's why we easily called prints()
    }
}