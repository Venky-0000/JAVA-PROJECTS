package practice;

import java.util.HashMap;

public class Hashmapexample {
	public static void main(String[] args) {
		HashMap<Integer, String> students=new HashMap<Integer, String>();
		students.put(100,"Jayanth");
		students.put(101,"Mohan");
		students.put(102, "Vishnu");
		students.put(103, "Shiva");
		students.put(104, "Puneeth");
		System.out.println(students);
		students.remove(102);
		System.out.println(students);
		students.put(104,"kushal");
		System.out.println(students);
		if(students.containsKey(107)) {
			System.out.println("yes it's exists");
		}
		else {
			System.out.println("No it's not exists");
		}
		if(students.containsValue("Jayanth")) {
			System.out.println("yes it's exists");
		}
		else {
			System.out.println("No it's not exists");
		}
		for(Integer rollNo:students.keySet()) {
			System.out.println(rollNo +" "+students.get(rollNo));
			
		}
		
	}

}
