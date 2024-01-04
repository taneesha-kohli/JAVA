

 class interfaceThread1 implements Runnable
 {
     @Override

     public void run() {
         int i=0;
         while(i<1000) {
             System.out.println("This is interface Thread1");
             i++;
         }
     }
 }
 class interfaceThread2 implements Runnable
 {
     @Override

     public void run() {
         int i=0;
         while(i<1000) {
             System.out.println("This is interface Thread2");
             i++;
         }
     }
 }

public class _33_Thread_using_runnable_interface {
    public static void main(String[] args) {
     interfaceThread1 ob1=new interfaceThread1();
     interfaceThread2 ob2=new interfaceThread2();

     Thread ob3=new Thread(ob1);        // it will evaluate as ob3.ob1()
     Thread ob4=new Thread(ob2);
     ob3.start();                      //it will be ob3.ob1.start(); == ob3.ob1.run();
     ob4.start();

     //as through ob3 we are running ob1.run();


     /*we did it because runnable is a interface , start() is exists inside the thread class , so when
      we extends thread class all method will inherit
     but we created object of interfaceThread1 and interfaceThread2  which implements runnable interface
     , where start() doesn't exists ,
     so we created ob1 and ob2 and passes as a argument in thread , we created thread object which is taking ob1 and ob2 , which
     have run() , so through ob3 and ob4 we are starting run() of ob1 and ob2 */

    }
}
