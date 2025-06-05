package practice;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> things=new ArrayList<String>();
		things.add("Air conditioner");
		things.add("Table");
		things.add("Chair");
		things.add("Pen");
		things.add("Bench");
		things.add("Comb");
		things.add("Zip");
		things.add("Laptop");
		things.add("Pad");
		things.add("Groom stick");
		System.out.println(things);
		Collections.sort(things);
		System.out.println("Array List: "+things);
		Collections.reverse(things);
		System.out.println(things);
		System.out.println(things.contains("laptop"));
		System.out.println(things.indexOf("Laptop"));
		things.remove(4);
		things.remove("Pad");
		for(int i=things.size();i<=0;i--) {
			System.out.println(things.get(i));
		}
		
	}

}
