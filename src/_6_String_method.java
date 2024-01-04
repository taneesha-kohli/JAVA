//public class _6_String_method {
//    public static void main(String[] args) {
//        String name = "Shivani";
//        int value = name.length();           //prints length of a string
//        System.out.println(value);
//
//        String lstring = name.toLowerCase();   //does string to in lowercase
//        System.out.println(lstring);
//
//        String ustring = name.toUpperCase();   //does string to in uppercase
//        System.out.println(ustring);
//
//       String nontrimmed = "      shivani        ";
//        System.out.println(nontrimmed);
//        String trimmed = nontrimmed.trim();
//        System.out.println(trimmed);
//
//        System.out.println(name.substring(3));
//
//        System.out.println(name.substring(1,5));
//
//        System.out.println(name.replace("S","t"));
//        System.out.println(name.replace("Shi","Tan"));
//        System.out.println(name.replace("i","tanu"));
//
//        System.out.println(name.startsWith("S"));
//        System.out.println(name.endsWith("i"));
//
//
//        System.out.println(name.charAt(0));
//        System.out.println(name.indexOf("S"));
//        String modifiedName = "shivanivani";
//        System.out.println(modifiedName.indexOf("vani"));   //it will give address of first vani
//        System.out.println(modifiedName.indexOf("vani",6)); //now it will find vani after 6 character
//
//        System.out.println(name.equals("Shivani"));
//        System.out.println(name.equals("tanu"));
//        System.out.println(name.equalsIgnoreCase("shivani"));  //this will ignore lower or upper case
//
//        String name1 = "India Is My Country";
//        String name2 = name1.replace(" ","-");
//        System.out.println(name2);
//        String lower =name2.toLowerCase();
//        System.out.println(lower);
//
//    }
//}

import java.util.Locale;

public class _6_String_method {
    public static void main(String[] args) {
        String ob= "India Is My Country";
        ob.length();
        System.out.println(ob.length());
        System.out.println(ob.toUpperCase());
        System.out.println(ob.toLowerCase(Locale.ROOT));
        System.out.println(ob.indexOf('S'));
        System.out.println(ob.equalsIgnoreCase("shivani"));
        System.out.println(ob.charAt(0));
        System.out.println(ob.replace("Shivani","Tanu"));
        System.out.println(ob.trim());
        System.out.println(ob.concat(" india is great"));
        System.out.println(ob.substring(3));
        System.out.println(ob.compareTo("tanu"));
        String str1=ob.toLowerCase();
        String str2 = str1.replace(" ","-");
        System.out.println(str2);


    }
}
