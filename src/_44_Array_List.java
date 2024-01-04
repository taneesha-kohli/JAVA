import java.lang.reflect.Array;
import java.util.ArrayList;

public class _44_Array_List {
    public static void main(String[] args) {
        /*using array list we can perform any operation in array without doing any extra work , because we get inbuilt functionality
        we get many methods
         */
       //we defines which type array list we want , here we want to use integer array list
        ArrayList<Integer> l1=new ArrayList<>();     //as we declare our array list ,now we can do anything using l1

//using add we adds elements in array
        l1.add(45);
        l1.add(5);
        l1.add(34);
        l1.add(23);
        l1.add(22);

        //we use size() to get length of array list
//        for (int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));        //we can't get array list element using l1[i] , we have to use get(index)
//
//        }

        //now we added element in array but we want to add more element so we can easily do this

        l1.add(343);            //remember , when we add element in array list so it adds in last index default

//        for (int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));
//
//        }

        //if we want to add element in specific index

        l1.add(1,1);   //1 will add in 1 index
        l1.add(0,0);     //0 will add in 0 index

//        for (int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));
//
//        }

        //if we want to replace any element with other element so we use set

        l1.set(1,1);   // we want to set 1 in 1 index so before element will replace with 1 in index 1
        l1.set(2,2);
//        for (int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));
//
//        }

        //if we want to add another array list in existing array list so how we will do that
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(5);
        l2.add(22);
        l2.add(3);
        l2.add(6);
        l2.add(89);

        //adding element of l2 in l1

        l1.addAll(l2);        // because we are using multiple element so we used addAll
//                for (int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));
//
//        }

        //if we want to remove specific element

        l1.remove(1);       //element at index 1 will delete
//        for (int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));
//
//        }

                // if we want to clear our array
//        l1.clear();       //all element will remove
//        for (int i=0;i<l1.size();i++)
//        {
//            System.out.println(l1.get(i));        //we will get empty array
//
//        }

        //if we want to check any element does exist in array or not,we use contains

        System.out.println(l1.contains(98));      //if exists so we will get true else false

        //if we want to check index of particular element

        System.out.println(l1.indexOf(5));




    }
}
