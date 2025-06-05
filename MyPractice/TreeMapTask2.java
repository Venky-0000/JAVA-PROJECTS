package MyPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTask2 {

	public static void main(String[] args) {
		TreeMap<String,String> country=new TreeMap<String, String>();
		country.put("India", "Delhi");
		country.put("USA", "Washington");
		country.put("Germany", "Berlin");
		country.put("Japan", "Tokyo");
		country.put("India", "New Delhi");
		System.out.println(country);
		for(Map.Entry<String, String>entry:country.entrySet()) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		System.out.println(country.firstKey());
		System.out.println(country.lastKey());
		System.out.println(country.higherKey("Germany"));
		System.out.println(country.lowerKey("Japan"));

	}

}
