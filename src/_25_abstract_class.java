//
//abstract  class ac
//{
//    abstract void greet();            //  abstract method ,which is necessary to implement in derived class , if we are creating abstract class
//                                    //so we will have to create class abstract
//}
//
//class derivedac extends ac              //it will show an error , we will have to override abstract method of abstract class
//{
//    @Override
//    void greet() {
//        System.out.println("this is deriving abstract class ac");
//    }
//}
//
//public class _25_abstract_class {
//    public static void main(String[] args) {
//        //ac ob = new ac();      //this will through and error
//        derivedac ob=new derivedac();
//        ob.greet();
//    }
//}
//
//
// /*
// which class has at least one abstract method known as abstract class , abstract method is that which method is not implemented
// abstract class object can't be created , abstract method is necessary to implement in derived class
//  */



abstract class phone
{
    abstract void music();
    abstract void on();
    abstract void light();
}
class redmi extends phone
{
    @Override
    void music() {
        System.out.println("Playing mp3 music");
    }

    @Override
    void light() {
        System.out.println("Adjustable Flashlight");
    }

    @Override
    void on() {
        System.out.println("Turning on with MIUI");
    }
}
public class _25_abstract_class {
    public static void main(String[] args) {
        redmi ob=new redmi();
        ob.light();
        ob.on();
        ob.music();
    }
}