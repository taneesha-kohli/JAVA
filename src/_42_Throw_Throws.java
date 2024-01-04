//
//   /* we know throw keyword is used to defined our own exception, but throws is used to alert other programmer with the exception
//   by defining throws in our method
//    */
//
//
//   class Arithmetic
//   {
//       int Mymeth (int a,int b)throws ArithmeticException      //it will alert from exception , as it could handle while calling the method
//       {
//           return a/b;
//       }
//
//   }
//
//public class _42_Throw_Throws {
//    public static void main(String[] args) {
//        Arithmetic ob=new Arithmetic();
//        try {
//            System.out.println(ob.Mymeth(2, 0));
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//        System.out.println("Exception has handled");
//
//
//        //it will throw an error, but let other programmer is using that method who is not
//        //aware about that exception so we will alert using throws, so then , who will use this method will handle this exception
//
//    }
//}

class NegativeRadiusException extends Exception
{
    @Override
    public String getMessage() {
        return "Negative radius exception , enter valid radius greater than 0";
    }
}

  class NegativeRadius
  {
      //r is denoting to radius
      double area(int r)throws NegativeRadiusException
      {
          if(r<0)
          {
              throw new NegativeRadiusException();
          }
          return (Math.PI*r*r);
      }

  }

public class _42_Throw_Throws {
    public static void main(String[] args) {
        NegativeRadius ob=new NegativeRadius();
        try {
            System.out.println(ob.area(-2));              //it will run perfectly until we entered negative radius
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("We handled negative radius exception");
    }
}