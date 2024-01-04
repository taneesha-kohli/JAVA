import java.util.HashSet;

public class _47_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hset=new HashSet<>();
        hset.add(23);
        hset.add(34);
        hset.add(25);
        hset.add(22);
        hset.add(22);

        //we can print hashset easily using it's object , hash set doesn't takes duplicate values

        System.out.println(hset);
    }
}
