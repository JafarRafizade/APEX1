import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();


        map.put("alma", 10);
        map.put("armud", 20);
        map.put("qarpiz", 15);


        System.out.println(map.get("alma"));


        map.remove("armud");


        System.out.println(map.containsKey("qarpiz"));


        System.out.println("Size of the map: " + map.size());
    }
}

