
class base
{
    void print()
    {
        System.out.println("this is base class print method");
    }
}

class derived1 extends base
{
    void print1()
    {
        System.out.println("this is derived class method");
    }
    @Override        //we can use override notation , to know that we have overrided this method of base
    void print()
    {
        System.out.println("this is overrided base method in derived class");
    }
}
public class _23_Method_Overriding {
    public static void main(String[] args) {
        derived1 ob=new derived1();
        ob.print1();
        ob.print();    //overrided content is prints , base class method would override

    }
}
