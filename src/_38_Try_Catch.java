public class _38_Try_Catch {
    public static void main(String[] args) {
        /*we use try catch to handle exception , try block tries to do any operation , if operation isn't possible
        so control goes in catch block and catch block code executes*/

        int a=243;
        int b=0;
        int c;

        //without try catch
//        c=a/b;
//        System.out.println(c);      //we can't divide any number by 0 this would arithmetic exception




        //now we will handle it through try catch


//        try
//        {
//            c=a/b;            //we enforces in try block to try it , if possible so result will print
//            System.out.println(c);
//        }
//        catch (Exception e)        //else we will catch that exception in e
//        {
//            System.out.println("This operation can't be perform due to :");
//            System.out.println(e);          //we will print that exception
//        }


        System.out.println("We handled exception");




        /*what happens, if any exception occurs so program terminates after displaying that exception
        but when we handle that exception with try catch so that exception prints and our other programs executes without any
        interruption */
    }
}
