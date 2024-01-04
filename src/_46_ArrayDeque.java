import java.util.ArrayDeque;

public class _46_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.add(12);
        ad.add(13);
        ad.add(14);
        ad.add(15);
        ad.addFirst(34);
        ad.addLast(45);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.removeFirst());
        System.out.println(ad.removeLast());
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());

    }
}
