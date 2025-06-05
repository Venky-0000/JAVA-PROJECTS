package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample123 {
	public static void main(String[] args) {
		HashSet<String> fruits=new HashSet<String>();
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Coconut");
		fruits.add("Guava");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Sapota");
		fruits.add("Pineapple");
		fruits.add("Mango");
		System.out.println(fruits);
		if(fruits.contains("mango")) {
			System.out.println("Yes it's exists");
		}
		else {
			System.out.println("no it's not exists");
		}
		ArrayList<String> fruit=new ArrayList<String>(fruits);
		System.out.println(fruit);
		
		Iterator<String> it=fruit.iterator();
		while(it.hasNext());{
			String phone=it.next();
			System.out.println(phone);
		}
	}

}
