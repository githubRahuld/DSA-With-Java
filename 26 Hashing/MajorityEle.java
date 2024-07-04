import java.util.*;

public class MajorityEle {

    public static void majorityElement(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        // Set<Integer> keys = mp.keySet();
        for (Integer k : mp.keySet()) {
            if (mp.get(k) >= n / 3) {
                System.out.println(k);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        majorityElement(arr);
    }

}