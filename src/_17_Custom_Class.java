
/*NOTE : there can be only single public class in java program ,which would the name of our java class*/

// public class custom
//  {
//       /*it will through an error , because public class is already exist*/
//  }

 class custom
 {
     int id;
     String name;
    void show()
    {
        System.out.println("Id : "+ id);
        System.out.println("Name : "+ name);
    }
 }

public class _17_Custom_Class {
    public static void main(String[] args) {

        /*to accessing the variable or function of our custom class we have to need to create object of class*/

        custom ob=new custom();    //object creation of custom class now we can access it's variable's and methods
        custom ob2=new custom();
        ob.id=45;
        ob.name="shivani";

        ob2.id=34;
        ob2.name="tanisha";
        ob.show();
        ob2.show();

    }
}
