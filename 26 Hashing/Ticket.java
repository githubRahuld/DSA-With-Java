import java.util.HashMap;

public class Ticket {

    public static String getStart(HashMap<String, String> tickets) {

        // to->from
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) { // 'From' me hai but 'To' me nahi hai
                return key; // start found
            }
        }

        return null;
    }

    public static void main(String[] args) {
        // from->to
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        System.out.print(start);

        for (String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
    }
}
// Mumbai->Delhi->Goa->Chennai->Bengaluru
