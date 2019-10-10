package threaddemos;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	Map<String,Integer> scores = new HashMap<String,Integer>();
	scores.put("Ayesha", 87);
	scores.put("Ayesha", 99);
	scores.put("Sam", 100);
	System.out.println(scores.get("Sam"));
}
}
