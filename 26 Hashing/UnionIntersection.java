import java.util.HashSet;

public class UnionIntersection {

    public static void unionIntersection(int arr1[], int arr2[]) {
        // * UNION
        HashSet<Integer> mp = new HashSet<>();

        int n = arr1.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++) {
            mp.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            mp.add(arr2[i]);
        }

        System.out.println("Union count = " + mp.size());

        // * INTERSECTION
        mp.clear();

        // Step 1: push arr1 ele's
        for (int i = 0; i < n; i++) {
            mp.add(arr1[i]);
        }
        // Step 2: then check arr2 ele present in map or not if present then it is
        // intersect ele

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (mp.contains(arr2[i])) {
                count++;
                mp.remove(arr2[i]);
            }
        }
        System.out.println("intersection =" + count);

    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        unionIntersection(arr1, arr2); // O(n+m)
    }
}
