import java.util.Scanner;

class animals
{
    int legs;
    String voiceType;
    String color;


    void set()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("How many Legs :");
        legs=ob.nextInt();
        System.out.println("what is Voice Type :");
        voiceType=ob.next();
        System.out.println("What is the color :");
        color=ob.next();
    }
    void get()
    {
        System.out.println("Legs       : "+legs);
        System.out.println("Voice Type : "+voiceType);
        System.out.println("Color      : "+color);
    }
}

                       /*NOTE : WE CAN'T PERFORM MULTIPLE INHERITANCE IN JAVA*/
     /*as by inheriting another class we didn't have to need to do same functionality we can access that class method just by creating
     that class object , and then we will add additional information in derived class*/
class dog extends animals    //we will create dog class by extending animals , and will add some additional details which we want
{
    float weight;
    animals ob1=new animals();
    void setWeight()
    {
        ob1.set();
        Scanner ob=new Scanner(System.in);
        System.out.println("Weight :");
        weight=ob.nextFloat();
    }
    void getWeight()
    {

        ob1.get();
        System.out.println("Weight     :"+weight);
    }
}

public class _20_Inheritance {
    public static void main(String[] args) {
        dog ob=new dog();
        ob.setWeight();
        ob.getWeight();

    }
}
