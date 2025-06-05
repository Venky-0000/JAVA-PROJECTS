package MyPractice;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<String,Integer> Studentmarks=new TreeMap<String, Integer>();
		System.out.println("Enter Class Strength:");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Student name "+i+" : ");
			String names=sc.nextLine();
			System.out.println("Enter Student marks of "+names+" : ");
			int marks=sc.nextInt();
			Studentmarks.put(names, marks);
			sc.nextLine();
		}
		System.out.println(Studentmarks);
		System.out.println("After sorting Students Marks");
		for(String students:Studentmarks.keySet())
			System.out.println(students+" : "+Studentmarks.get(students));
		sc.close();
	}

}
