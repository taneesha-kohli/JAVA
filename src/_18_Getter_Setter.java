import java.util.Scanner;

class circle{
   private float r;
   private float area;
   private float circumference;

    void setRadius()
    {
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter the value for radius :");
            r = ob.nextFloat();


    }
    void getArea()
    {
        area=(3.14f*r*r);
        System.out.println("Area of circle : "+ area);
    }
    void getCircumference()
    {
        circumference=2*3.14f*r;
        System.out.println("circumference of circle : " + circumference);
    }
}
public class _18_Getter_Setter {
    public static void main(String[] args) {
     circle ob=new circle();
     ob.setRadius();
     ob.getArea();
     ob.getCircumference();
    }
}
