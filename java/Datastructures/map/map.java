import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<Integer, String>();
        people.put(32, "Bob");
        people.put(45, "Peter");
        System.out.println("Size: " + people.size());
        for (Map.Entry<Integer,String> e: people.entrySet()) {
            System.out.println(e.getValue() + "\t" + e.getKey());
        }
    }
}