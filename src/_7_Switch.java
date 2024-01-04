//import java.util.Scanner;
//
//public class _7_Switch {
//    public static void main(String[] args) {
//        Scanner ob=new Scanner(System.in);
//        System.out.println("Enter your age :");
//        int age =ob.nextInt();
//        switch (age)
//        {
//            case 18:
//                System.out.println("You are going to become an adult");
//                break;
//            case 23:
//                System.out.println("You are going to join a job");
//              break;
//            case 68:
//                System.out.println("You are going to get retire");
//               break;
//            default:
//                System.out.println("Enjoy your life");
//        }
//
//
//        String var = "Shivani";
//        switch (var)
//        {
//            case "Shivani" -> //{
//                System.out.println("You are going to become an adult");
////                System.out.println("You are going to become an adult");
////                System.out.println("You are going to become an adult");
////            }
//            case "Shivam" -> System.out.println("You are going to join a job");
//            case "Tanisha" -> System.out.println("You are going to get retired");
//            default -> System.out.println("Enjoy your life");
//        }
//        System.out.println("Thanks for usign my java code");
//    }
//}
//


public class _7_Switch {
    public static void main(String[] args) {
        int age = 18;

        /* first method */

//        switch (age)
//        {                     // by using this method with -> we didn't have to need to use break
//            case 12->
//                    System.out.println("You are not eligible for vote");
////             break;
//            case 18->
//                    System.out.println("You can vote");
////                break;
//            case 90->
//                    System.out.println("You can't vote");
////                break;
//            default->
//                    System.out.println("Age is invalid");
//        }
//
//
//        /*second method*/
//        switch (age)
//        {                     // by using this method with -> we didn't have to need to use break
//            case 12:
//                    System.out.println("You are not eligible for vote");
//             break;
//            case 18:
//                    System.out.println("You can vote");
//                break;
//            case 90:
//                    System.out.println("You can't vote");
//                break;
//            default:
//                    System.out.println("Age is invalid");
//        }


        /*third method */
        switch (age)
        {                     // by using this method with -> we didn't have to need to use break
            case 12: {
                System.out.println("You are not eligible for vote");
            }
             break;
            case 18: {
                System.out.println("You can vote");
                System.out.println("hello world");

            }
                break;
            case 90: {
                System.out.println("You can't vote");
            }
                break;
            default: {
                System.out.println("Age is invalid");
            }
        }
    }
}