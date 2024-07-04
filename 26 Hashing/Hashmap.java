import java.util.HashMap;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 150);
        hm.put("Pak", 250);
        hm.put("China", 500);
        hm.put("Zim", 80);

        // all TC: O(n)

        // print Map
        System.out.println(hm); // {China=500, Pak=250, India=150, Zim=80}

        // get
        int population = hm.get("India");
        System.out.println(population); // 150
        System.out.println(hm.get("NewZeland")); // null

        // ContainsKey/search
        System.out.println(hm.containsKey("Pak")); // true
        System.out.println(hm.containsKey("Canada")); // false

        // remove
        hm.remove("China");
        System.out.println(hm);

        // Iterate
        Set<String> keys = hm.keySet(); // all keys are stored in set
        for (String k : keys) {
            System.out.println("Key: " + k + ",value = " + hm.get(k));
        }

        // clear map
        hm.clear();
        System.out.println(hm); // {}
    }
}
