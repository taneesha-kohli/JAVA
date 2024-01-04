//
//class constThread extends Thread
//{
//    constThread(String name)
//    {
//        super(name);          //super(name) it mean there is a constructor in thread class which is taking name as argument
//                                //we know using super we enforces to run base class constructor , mainly uses super to invoke
//                                // argument constructor of base class , this name will assign to thread
//
//    }
//}
//
//class constThread2 extends Thread
//{
//    constThread2(String name2)
//    {
//        super(name2);
//    }
//}
//
//public class _34_Constructor_From_Thread {
//    public static void main(String[] args) {
//      constThread ob=new constThread("Constructor thread");
//      ob.start();
//      constThread2 ob1=new constThread2("Constructor Thread2");
//      ob1.start();
//      //using ob.getName() we will get thread name and using ob.getId() we will get thread id
//        System.out.println("Name of Thread1 : "+ob.getName());
//        System.out.println("Id of Thread1   : "+ob.getId());
//        System.out.println("Name of Thread2 : "+ob1.getName());
//        System.out.println("Id of Thread2   : "+ob1.getId());
//    }
//}


          /*we have to implement Thread(Runnable r,String name)*/

class MyThread1 implements Runnable
{
    @Override
    public void run() {
        int i=0;

            System.out.println("This is thread using Runnable interface");

    }
}class MyThread2 implements Runnable
{
    @Override
    public void run() {

            System.out.println("This is thread2 using Runnable interface");
    }
}
public class _34_Constructor_From_Thread {
    public static void main(String[] args) {
        MyThread1 ob1=new MyThread1();
        MyThread2 ob2=new MyThread2();
        Thread ob3=new Thread(ob1,"Thread1");
        Thread ob4=new Thread(ob2,"Thread2");
        ob3.start();
        ob4.start();

        System.out.println("Name of Thread 1 :"+ob3.getName());
        System.out.println("Name of Thread 2 :"+ob4.getName());
        System.out.println("Id of Thread 1   :"+ob3.getId());
        System.out.println("Id of Thread 2   :"+ob4.getId());
    }
}