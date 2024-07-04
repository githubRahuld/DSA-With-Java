import java.util.HashSet;

public class CountDistinctELe {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 4, 4, 5, 8, 1, 0, 4, 1 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // count duplicate also as 1
        System.out.println(set.size()); // 7
    }
}
