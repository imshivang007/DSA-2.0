import java.util.HashMap;


public class ItineraryFromTickets {

    public static String findStartingPoint(HashMap<String, String> tickets) {
        HashMap<String, String> reverseMap = new HashMap<>();

        for (String source : tickets.keySet()) {
            String destination = tickets.get(source);
            reverseMap.put(destination, source);
        }

        for (String source : tickets.keySet()) {
            if (!reverseMap.containsKey(source)) {
                return source;
            }
        }

        return null; 
    }

    public static void printItinerary(HashMap<String, String> tickets, String start) {
        String currentLocation = start;

        while (tickets.containsKey(currentLocation)) {
            String nextLocation = tickets.get(currentLocation);
            System.out.print(currentLocation+ " -> "+ nextLocation + "\n");
            currentLocation = nextLocation;
        }
    }

    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Bombay", "Delhi"); 
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start = findStartingPoint(tickets);

        System.out.println("The starting point of the itinerary is: " + start);

        System.out.println("The complete itinerary is:");
        printItinerary(tickets, start);





    }
}
