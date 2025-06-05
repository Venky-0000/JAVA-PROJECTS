package MyPractice;

import java.util.TreeSet;

public class TreesSetLibrary {

	public static void main(String[] args) {
		TreeSet<Integer> libraray=new TreeSet<Integer>();
		libraray.add(5002);
		libraray.add(4998);
		libraray.add(5005);
		libraray.add(4999);
		libraray.add(5001);
		System.out.println("First Book "+libraray.first());
		System.out.println("Last Book "+libraray.last());
		System.out.println("Top ID Book "+libraray.higher(4999));
		System.out.println("First Book "+libraray.lower(5001));
	}

}
