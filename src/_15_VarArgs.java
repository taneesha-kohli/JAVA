//public class _15_VarArgs {
//
////    static int sum(int a1,int a2)
////    {
////        int result=a1+a2;
////        return result;
////    }
////    static int sum(int b1,int b2,int b3)
////    {
////        int result =b1+b2+b3;
////        return result;
////    }
////    static int sum(int c1,int c2,int c3,int c4)
////    {
////        int result=c1+c2+c3+c4;
////        return result;
////    }
//
//
//
//
//    /*THIS IS KNOWN VARARGS*/
//
////    static int sum(int ...arr)     //doesn't matter how range is of argument , those will store in arr , will available as arr[]
////    {
////        int result=0;
////        for(int a:arr)          //we will store all arguments in a through for each loop
////        {
////           result+=a;            //a stores all elements one by one so we will add elements in result one by one
////
////        }
////        return result;
////    }
//
//
//    /*IF WE WANT TO GIVE A ELEMENT COMPULSORY SO WE CAN DO THIS*/
//    static int sum(int x,int ...arr)
//    {
//        int result=x;
//        for(int a:arr)
//        {
//            result+=a;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//     /*
//     varargs is the way to perform overloading in multiple argument , just by creating single method*/
//        System.out.println(sum(3,4));
//        System.out.println(sum(3,4,8));
//        System.out.println(sum(3,4,9,3));
//        System.out.println(sum(3,4,4,6,6));
//        System.out.println(sum(3,4,1,6,9,6));
//
//        //  now we can use any range of argument
//
//        /*if we increases list of our argument so we have to also increase the function creation, but using concept of varargs
//        we can use any range of argument just by single function*/
//
//
//    }
//}


public class _15_VarArgs {
    static int add(int ...arr)
    {
        int sum=0;
       for(int a:arr)
       {
           sum+=a;
       }
       return sum;
    }

    static int mul(int ...arr1)
    {
        int mult=1;
        for (int a1:arr1)
        {
            mult=mult*a1;
        }
        return mult;
    }


    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(add(5,6,7));
        System.out.println(mul(4,2));
        System.out.println(mul(6,4,2));


    }
}