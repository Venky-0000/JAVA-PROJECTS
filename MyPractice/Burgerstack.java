package MyPractice;

import java.util.*;

public class Burgerstack {

	public static void main(String[] args) {
		Stack<String> burgerstack=new Stack<String>();
		burgerstack.push("Burger1");
		burgerstack.push("Burger2");
		burgerstack.push("Burger3");
		burgerstack.push("Burger4");
		System.out.println("top burger is"+burgerstack.peek());
		System.out.println("serving"+burgerstack.pop());
		if(burgerstack.isEmpty()) {
			System.out.println("all burgers are served");
		}
		else {
			System.out.println("not empty"+burgerstack);
		}
		for(String bg:burgerstack) {
			System.out.println(bg);
		}

	}

}
