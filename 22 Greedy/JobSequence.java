import java.util.*;

public class JobSequence {

    public static void jobSequence(int jobs[][]) {
        int time = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // sort by profit
        int list[][] = new int[jobs.length][3];
        // (index,deadline,profit)
        for (int i = 0; i < jobs.length; i++) {
            list[i][0] = i;
            list[i][1] = jobs[i][0];
            list[i][2] = jobs[i][1];
        }

        Arrays.sort(list, Comparator.comparingDouble(o -> o[2]));

        int noOfTasks = 0;
        for (int i = list.length - 1; i >= 0; i--) {
            if (time < list[i][1]) {
                noOfTasks++;
                time++;
                ans.add(list[i][0]);
            }
        }

        // print seq
        System.out.println("Total task: " + noOfTasks);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // every job can be done in 1 unit of time
        // maximise the profit
        // given (deadline,profit)
        int jobs[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        jobSequence(jobs);

    }
}
