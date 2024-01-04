import java.util.LinkedList;

public class _45_Linked_list {
    public static void main(String[] args) {
        //linked list is similar as array list, but there are some different functions in linked list

        LinkedList<Integer> li=new LinkedList<>();
        LinkedList<Integer> li2=new LinkedList<>();
        li.add(45);
        li.add(34);
        li.add(22);
        li.add(11);

        //these are different than arraylist method
        li.addFirst(20);
        li.addLast(10);

        li2.add(23);
        li2.add(3);
        li2.add(2);
        li2.add(12);

        li.addAll(0,li2);

        for (Integer integer : li) {
            System.out.println(integer);
        }

    }
}
