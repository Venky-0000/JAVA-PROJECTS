package MyPractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {

	public static void main(String[] args) {
		Queue<String> icecreams = new LinkedList<String>();
		
		icecreams.add("Kid 1");
		icecreams.add("Kid 2");
		icecreams.add("Kid 3");
		icecreams.add("Kid 4");
		icecreams.add("Kid 5");
		
		System.out.println(" The kids who are waiting for icecreams : " + icecreams);
		
		System.out.println(icecreams.add("vishnu"));
		System.out.println(icecreams);
	}

}
