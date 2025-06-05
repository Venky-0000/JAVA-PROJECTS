package MyPractice;

import java.util.TreeMap;


public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> students=new TreeMap<Integer, String>();
		students.put(1,"Ram");
		students.put(0,"Ravan");
		students.put(-22,"Arjun");
		students.put(-56,"Ravi");
		students.put(50,"Ravi");
		System.out.println(students.get(-22));
		System.out.println(students.containsKey(-22));
		System.out.println(students.containsValue("Ravi"));
		System.out.println(students);
	}

}
