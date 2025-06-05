package MyPractice;

import java.util.TreeSet;

public class TreeSetTask {

	public static void main(String[] args) {
		TreeSet<Integer> unique=new TreeSet<Integer>();
		unique.add(1000);
		unique.add(1675);
		unique.add(999);
		unique.add(345);
		unique.add(1000);
		unique.add(1999);
		unique.add(7777);
		System.out.println(unique);
		for(Integer num:unique) {
			System.out.println(num);
		}
		
	}

}
