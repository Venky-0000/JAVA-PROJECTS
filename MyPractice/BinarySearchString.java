package MyPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names= {"Amit","Divya","Karan","Priya","Zoya"};
		System.out.print("Enter Name You Want:");
		String str=sc.nextLine();
		int index=Arrays.binarySearch(names, str);
		if(index>=0) {
			System.out.println("it exists");
		}
		else {
			System.out.println("it not exists");
		}
		sc.close();
	}

}
