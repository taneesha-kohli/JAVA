//public class _14_Method_Overloading {
//    static void overloadfunc()
//    {
//        System.out.println("this is function overloading with no parameter");
//    }
//    static void overloadfunc(int a1)
//    {
//        System.out.println("This is function with single parameter :"+a1);
//    }
//    static  void overloadfunc(int b1,int b2)
//    {
//        System.out.println("This is function with 2 parameter : "+ b1 +"\t"+ b2);
//    }
//    static void integer (int a1)     //passing element from main
//    {
//        a1=56;
//    }
//    static void array(int []arr1)
//    {
//        arr1[0]=78;
//    }
//
//    public static void main(String[] args) {
//       int a=45;
//       integer(a);
//        System.out.println("value of a is : "+ a);   //a value will not change because in function element's copy is passed
//
//     int arr[]={3,4,5,6};
//     array(arr);
//      /*if we passes array to function so we are accessing or changing array with it's index , which is the address of array elements
//        so changes are performed in address, that's why function's changed value is taken*/
//        System.out.println("arr's first element : "+arr[0]);
//
//
//        /*Method Overloading*/
//        overloadfunc();
//        overloadfunc(34);
//        overloadfunc(45,64);
//    }
//}



