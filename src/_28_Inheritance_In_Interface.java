
interface baseInterface
{
    void meth1();
    void meth2();
}
interface derivedInterface  extends baseInterface            //we can inherit interface in another interface
{
    void meth3();
    void meth4();
}

class interfaceClass implements derivedInterface        //in class we implements interface
{
    @Override
    public void meth1() {

        System.out.println("this is meth1 of baseInterface");
    }
    public void meth2() {
        System.out.println("this is meth2of baseInterface");
    }

    public void meth3() {
        System.out.println("this is meth1 of derivedInterface");
    }
    public void meth4()
    {
        System.out.println("this is meth1 of derivedInterface");
    }
}

public class _28_Inheritance_In_Interface {
    public static void main(String[] args) {
        interfaceClass ob=new interfaceClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
        ob.meth4();
    }
}
