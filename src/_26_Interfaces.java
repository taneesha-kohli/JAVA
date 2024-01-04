
//NOTE : we can extend class also can implements interfaces together

abstract class dateobbirth
{
    abstract void dob();
}
interface  details         //syntax for interface , we don't use class
{
    int a=5;
    void addname();
    void addage();
    void addid();
    void addaddress();
}

class student extends dateobbirth implements details
{
    String address="kdjdfkjkdf";
    int id=34;
    int age=45;
    String birth="23 feb 1999";
    String name="shivani";
    @Override
    public void addaddress() {            //we have to derive method with public keyword in interfaces
        System.out.println("Address : "+address);
    }

    @Override
    public void addid() {
        System.out.println("Id : "+id);
    }

    @Override
    public void addname() {
        System.out.println("Name : "+name);
    }

    @Override
    public void addage() {
        System.out.println("Age : "+age);
    }

    /*dateofbirth class method*/

    @Override
    void dob() {
        System.out.println("dob : "+birth);
    }
}

   /*Inherit Multiple interfaces */
      interface students{
          void stuinfo();
   }
   interface faculty
   {
       void facinfo();
   }
   interface course
   {
       void courseinfo();
   }

   class university implements students,faculty,course        //this makes inheritance different from abstract classes
   {
       @Override
       public void stuinfo() {
           System.out.println("Student information");
       }

       @Override
       public void facinfo() {
           System.out.println("Faculty information");
       }

       @Override
       public void courseinfo() {
           System.out.println("Course information");
       }
   }

public class _26_Interfaces {
    public static void main(String[] args) {
        /*DIFFERENCE BETWEEN ABSTRACT AND INTERFACES------
        in abstract classes multiple inheritance is not allowed we can't inherit multiple abstract class
        but in interfaces we can perform multiple inheritance , we can derive multiple interfaces , and we use
        implements keyword to inherit interfaces
        */

        student ob=new student();
        ob.addid();
        ob.addname();
        ob.addaddress();
        ob.addage();

        university ob1=new university();
        ob1.courseinfo();
        ob1.stuinfo();
        ob1.facinfo();
    }
}
