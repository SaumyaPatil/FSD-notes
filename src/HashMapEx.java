import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {
        //Hashmaps are faster than hashtable since its non synchronised.
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Ram");
        mp.put(2, "Shyam");
        mp.put(3, "Sohan");
        mp.put(4, "Abhishek");
        mp.put(null, "Saumya");
        mp.put(null, null);
        System.out.println(mp);
        mp.remove(45);
        System.out.println(mp.size());
        System.out.println(mp);
    }
}
