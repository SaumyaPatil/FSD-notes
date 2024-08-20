import java.util.HashSet;

public class HashSetEx {
    //No order
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        hs.add(70);
//        hs.remove(10);
//        System.out.println(hs.contains(30));
        System.out.println(hs);
        for (Integer str1: hs){
            System.out.println(str1);
        }
    }
}
