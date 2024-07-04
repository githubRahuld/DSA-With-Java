import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> mp = new HashMap<>();

        // step 1: store characters of String s in map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // step 2: check string t characters present in map or not

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            // if char present then decrese its value by 1 from map
            if (mp.get(ch) != null) {
                if (mp.get(ch) == 1) {
                    mp.remove(ch);
                } else {
                    mp.put(ch, mp.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return mp.size() == 0;
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        System.out.println(isAnagram(s, t));
    }
}
