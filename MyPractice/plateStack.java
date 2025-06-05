package MyPractice;

import java.util.Stack;

public class plateStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>pt=new Stack<String>();
		pt.push("plate1");
		pt.push("plate2");
		pt.push("plate3");
		pt.push("plate4");
		pt.push("plate5");
		System.out.println(pt);
		System.out.println("top of the plate"+pt.peek());
		System.out.println("the plate taken to eat"+pt.pop());
for(String pts:pt) {
	System.out.println("remaing"+pts);
}
		

	}

}
