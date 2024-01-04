
          /*
          We know about threading , when process devides in many child processes so those child processes known thread
          this is used to perform multitasking , in less time , process would be heavy weight , but thread would be light weight
          multithreading can be perform by os and also by user , here multithreading will done by user
          */

    class thread1 extends Thread          //we will have to extend thread class to performing multithreading
    {
        @Override

        public void run()               //run is method of thread class , we will override it
        {
           int i=0;
            while(i<100) {
                System.out.println("This is thread1");
                i++;
            }
        }
    }

          class thread2 extends Thread          //we will have to extend thread class to performing multithreading
          {
              @Override

              public void run()               //run is method of thread class , we will override it
              {
                int  i=0;
                  while(i<100) {
                      System.out.println("This is thread2");
                      i++;
                  }
              }
          }

public class _32_Creating_Thread_by_Extending_Thread_class {
    public static void main(String[] args) {
        thread1 ob1=new thread1();
        thread2 ob2=new thread2();
//        ob1.start();
//        ob2.start();

        //without using thread first thread1 will execute then thread2 will execute
        ob1.run();
        System.out.println("\n");
        ob2.run();

        //in output thread1 and thread2 executing concurrently

        /*to call run() we use Start() , then thread calls run() itself , concurrently */

    }
}
