package MyPractice;

import java.util.TreeSet;

public class TreeSetEmployee {

	public static void main(String[] args) {
		TreeSet<String> Employee=new TreeSet<String>();
		Employee.add("Sumith");
		Employee.add("Karan");
		Employee.add("Anjali");
		Employee.add("Mohan");
		Employee.add("Zoya");
		System.out.println(Employee);
		System.out.println(Employee.descendingSet());
        }

}
