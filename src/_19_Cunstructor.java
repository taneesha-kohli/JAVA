
class cons
{
    private int id;
    private String name;

    /*WE CAN DO CONSTRUCTOR OVERLOADING AS HERE WE DID , SAME NAME CONSTRUCTOR BUT WITH DIFFERENT ARGUMENT, WE CAN CREATE MORE
    CONSTRUCTORS WITH DIFFERENT ARGUMENT
     */

    cons(int i,String n)   //this is called parameterised constructor with arguments
    {
        id=i;
        name=n;
        System.out.println("Your id : " + id);
        System.out.println("Your name : "+ name);
    }
    cons()   //this is known default constructor with no argument
    {
        System.out.println("This is constructor with no argument or known as default constructor");
    }
    cons(int i)
    {
        System.out.println("this is constructor with single argument :"+i);
    }
}
public class _19_Cunstructor {
    public static void main(String[] args) {
        //to set and get values of id and name we have to need to create getter and setter , but using constructor we didn't need of that
      cons ob=new cons(4,"shivani");  //we have need to give it parameter
      //constructor will invoke automatically just by creating object of class , because it has same name of class
        cons ob1=new cons();
        cons ob2=new cons(9);

    }
}
