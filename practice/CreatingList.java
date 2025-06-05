package practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CreatingList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> cricketers=new ArrayList<String>();
		System.out.println("Enter cricketers names");
		for(int i=1;i<=5;i++) {
			System.out.println("Enter cricketer name : "+i);
			String str=sc.nextLine();
			cricketers.add(str);
		}
		System.out.println(cricketers);
		sc.close();
	}

}
