import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer, String> tb = new Hashtable<>();
        tb.put(10, "Zoish");
        tb.put(11, "Gourav");
        tb.put(12, "Raj");
        tb.put(13, "Sahil");
        tb.put(14, "Gautam");
        tb.put(15, "Suraj");
//        tb.put(null, null);    //It will throw exception

//        tb.remove(12);
//        System.out.println(tb.containsKey(8));
//        System.out.println(tb.containsValue("Zoish"));
//        System.out.println(tb);
//        System.out.println(tb.size());

        //Here, pt is a part of the keyset that takes value of each key and prints it.
//        for(Integer pt: tb.keySet()){
//            System.out.println(pt);
//        }

        //Enhanced loop
        //To print keys and values
        for(Integer pt: tb.keySet()){
            System.out.println(pt+ " " +tb.get(pt));
        }

        for (Map.Entry<Integer, String> pt: tb.entrySet()){
            System.out.println(pt.getKey()+" "+ pt.getValue());
        }

    }
}
