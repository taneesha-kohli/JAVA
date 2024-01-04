
class priority extends Thread
{
    @Override
    public void run() {
        int i=0;
        while(i<1000) {
            System.out.println("This is Thread : " + this.getName());
            i++;
        }
    }
    priority(String name)
    {
        super(name);
    }
}

public class _35_Thread_Priority {
    public static void main(String[] args) {
        priority ob1=new priority("Thread1");
        priority ob2=new priority("Thread2");
        priority ob3=new priority("Thread3");
        priority ob4=new priority("Thread4");
        priority ob5=new priority("Thread5");

        ob1.setPriority(Thread.MAX_PRIORITY);   //we set thread 1 high priority , so thread 1 execution will high , than others
        ob2.setPriority(Thread.MIN_PRIORITY);
        ob3.setPriority(Thread.NORM_PRIORITY);
        ob4.setPriority(Thread.MIN_PRIORITY);
        ob5.setPriority(Thread.NORM_PRIORITY);

        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();
        ob5.start();

    }
}
