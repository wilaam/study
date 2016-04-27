import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by stawicad on 2016-04-27.
 */
public class HashMaps {

    public static void main(String[] args) {
        int[] count = new int[1000000];
        count[1] = 5;
        count[123] = 1;
        count[228] = 10;


//        count[21847782742834492l] = 3;
//        count[4547782742834492l] = 7;
//        count[9956764742834492l] = 4;
        Map<Long, Integer> count2 = new HashMap<Long, Integer>();//int[] count;
        count2.put(21847782742834492l, 3);
        count2.put(4547782742834492l, 7);
        count2.put(9956764742834492l, 4);
        System.out.println(count2);

        Map<String, Boolean> city = new HashMap<String, Boolean>();
        city.put("Lodz", true);
        city.put("Krakow", true);
        city.put("Gdansk", true);


        Set<String> city2 = new HashSet<String>(); //boolean[] city;
        city2.add("Lodz");
        city2.add("Krakow");
        city2.add("Gdansk");
        System.out.println(city2.contains("Lodz"));
    }
}
