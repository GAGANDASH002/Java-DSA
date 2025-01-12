import java.util.HashMap;

class Main{
    public static String getStart( HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();
        
        // Make a reverse map to find starting point
        for(String key: tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        // Find the starting point
        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.println(start);
        for(String key: tickets.keySet()){
            System.out.println("->" + tickets.get(start));
            start = tickets.get(start);
        }
    }
}