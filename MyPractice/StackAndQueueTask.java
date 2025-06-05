package MyPractice;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueTask {

	public static void main(String[] args) {
		Stack<String> ToyBox = new Stack<String>();
		System.out.println("The elements in the toybox is:");
		ToyBox.push("Ball");
		ToyBox.push("Blocks");
		ToyBox.push("Puzzle");
		ToyBox.pop();
		System.out.println(ToyBox);
		Queue<String> IceCreamLine=new LinkedList<String>();
		IceCreamLine.add("Maya");
		IceCreamLine.add("Leo");
		IceCreamLine.add("Lina");
		System.out.println(IceCreamLine);
		IceCreamLine.poll();
		System.out.println(IceCreamLine);
}
}
