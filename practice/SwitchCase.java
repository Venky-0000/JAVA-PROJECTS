package practice;

import java.util.Scanner;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your day of a week::");
		String day=sc.nextLine().toLowerCase();
		switch(day) {
		case "monday":
			System.out.println("Lets Learn python");
			break;
		case "tuesday":
			System.out.println("Lets Learn java");
			break;
		case "wednesday":
			System.out.println("Lets Learn c");
			break;
		case "thursday":
			System.out.println("Lets Learn c++");
			break;
		case "friday":
			System.out.println("Lets Learn AI");
			break;
		case "saturday":
			System.out.println("Lets Learn Machine Learning");
			break;
		case "sunday":
			System.out.println("Lets Learn flutter");
			break;
		default:System.out.println("always do practice");
		}
		sc.close();
	}

}
