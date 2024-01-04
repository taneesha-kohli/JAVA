
class Thread1 extends Thread
{
    @Override
    public void run() {
        int i=0;
        while(i<1000) {
            try {
                Thread.sleep(200);            //thread will stop for 200ms
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("This is Thread1");
            i++;
        }
    }
}class Thread2 extends Thread
{
    @Override
    public void run() {
        int i=0;
        while(i<1000) {
            System.out.println("This is Thread2");
            i++;
        }
    }
}

public class _36_Thread_Method {
    public static void main(String[] args) throws InterruptedException {
        Thread1 ob=new Thread1();
        Thread2 ob1=new Thread2();

        /*we will see join() and sleep()   join() is used if we want to execute particular method , with priority, sleep()
        is we want to stop any method for a while in ms
         */

        ob.start();
        try {
            ob.join();            //it will through an error so we will wrap it inside try catch block , which will handle exception

        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }


        ob1.start();


    }
}
