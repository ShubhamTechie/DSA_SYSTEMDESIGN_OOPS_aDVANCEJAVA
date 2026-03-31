package CollectionAndGenerics.Challenges;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

void main(){

        Map<String , Integer> map = new HashMap<>();
        map.put("shubham" , 25);
        map.put("sahu" , 85);
        map.put("Ram" , 85);
        map.put("shyam" , 85);
    System.out.println(map.size());
    System.out.println(map.get("shubham"));
    System.out.println(map.containsKey("shubham"));
    }
}
