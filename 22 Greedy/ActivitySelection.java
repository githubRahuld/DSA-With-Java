import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static void activitySelection(int start[], int end[]) {

        // sorting basis of end time
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // index
            activities[i][1] = start[i]; // start time
            activities[i][2] = end[i]; // end time
        }

        // sort
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 1;
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) { // non overlapping
                // activity selected
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max activity selected: " + maxAct);

        System.out.print("Selected activities are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        activitySelection(start, end);
    }
}
