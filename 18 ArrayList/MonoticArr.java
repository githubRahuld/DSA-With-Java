import java.util.ArrayList;

public class MonoticArr {

    public static boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i=0; i<A.size()-1; i++) {
            if (A.get(i) > A.get(i+1))
                inc = false;
            if (A.get(i) < A.get(i+1))
                dec = false;
        }
        return inc || dec;
    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(1); //1,2,2,3 true
        A.add(2);
        A.add(2);
        A.add(3);

        //6,4,3,2  true
        // 1,3,2 false
       
        System.out.println(isMonotonic(A));
        //monotonic arrays :- incresing ya decresing order me ho
        // incresing :- i <= j, nums.get(i) <= nums.get(j).
        // incresing :- i <= j, nums.get(i) >= nums.get(j).
    }
}
