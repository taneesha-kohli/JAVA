

class access
{
    public int a=45;
    protected  int b=23;
    int c=89;   //default modifier , easily accessible
    private int d=8923;  //can't be accessible anywhere outside the class

void print()     //class's method can access anytype of variable
{
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
}
}

class next
{
void show()
{
    access ob=new access();
    System.out.println(ob.a);
    System.out.println(ob.b);
    System.out.println(ob.c);
}

}
public class _31_Access_Modifiers {
    public static void main(String[] args) {
        access ob=new access();
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);

        //all classes can access everytype access modifier accept to private

        /*NOTE : if we are accessing this class method or variable
        in other package so only public and default variable will
        be accessible , private and protected variables can't be accessible
         */

    }
}
