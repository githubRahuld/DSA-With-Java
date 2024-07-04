import java.util.PriorityQueue;

public class CompareObj {

    static class Students implements Comparable<Students> { // overriding
        String name;
        int rank;

        public Students(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Students s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Students> pq = new PriorityQueue<>();

        pq.add(new Students("Deepak", 131));
        pq.add(new Students("Raj", 342));
        pq.add(new Students("Gayatri", 43));
        pq.add(new Students("Shivam", 941));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
