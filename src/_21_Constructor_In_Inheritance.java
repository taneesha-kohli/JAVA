
class base1
{
    int a,b;
    base1()
    {
        System.out.println("This is base class default constructor");
    }
    base1(int a)
    {
        System.out.println("this is base class constructor with one argument : "+a);
    }
}

class derived extends base1
{
    int x;
    derived()   //if we want to invoke base class constructor with argument so we will use super keyword
    {
//        super(6);
        System.out.println("this is default constructor of derived class");
    }
    derived(int x,int y )    //y will copy in base class constructor with single argument
    {
        super(y);
        System.out.println("this is derived class constructor with single argument : "+x);
    }
}

class derived2 extends derived
{
    int z;
    derived2()
    {
//        super(4,5);      //this will invoke derived class constructor with 2 arguments
        System.out.println("this is default constructor of derived2");
    }
    derived2(int t1,int t2,int t3)
    {
        super(t2,t3);    //this works as constructor list
        System.out.println("this is derived2 constructor with single argument : "+t1);
    }

}
public class _21_Constructor_In_Inheritance {
    public static void main(String[] args) {
      //  derived ob=new derived();  //this will invoke derived class default constructor , but first base class default constructor will invoke
       // derived ob1= new derived(5,6);

        derived2 ob3=new derived2();   //by default this will call default constructor of derived class derived class has inherited base so
        //first base class default constructor will invoke , than derived , at last derived2 , that depends upon us if we want to call derived
        //class's argument constructor so we can do it by super keyword
    }
}


//class base
//{
//    base()
//    {
//        System.out.println("default constructor of base class");
//    }
//    base(int a,int b)
//    {
//        System.out.println("base class constructor with 2 arguments :"+(a)+(b));
//    }
//}
//
//class derived1 extends base
//{
//    derived1()
//    {
//        // super(3,6);    //in place of default constructor , constructor with argument will invoke of base
//        System.out.println("this is default constructor of derived1");
//    }
//    derived1(int x,int y,int z)
//    {
//        // super(4,5);      //we can pass argument in this way
//        super(y,z);     //also in this way
//        System.out.println("this is derived1 constructor with 1 argument : "+x);
//    }
//}
//public class _21_Constructor_In_Inheritance {
//    public static void main(String[] args) {
//        derived1 ob=new derived1();
//        derived1 ob1=new derived1(4,5,6);
//    }
//}