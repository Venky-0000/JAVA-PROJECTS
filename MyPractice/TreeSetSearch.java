package MyPractice;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<String> Product=new TreeSet<String>();
		Product.add("Keyboard");
		Product.add("Mouse");
		Product.add("Monitor");
		Product.add("CPU");
		Product.add("Webcam");
		System.out.println(Product);
		System.out.print("Enter product Name:");
		String str=sc.nextLine();
			if(Product.contains(str)) {
				System.out.println("it exists");
			}
			else {
				System.out.println("it's not exists");
			}
		}
	}
