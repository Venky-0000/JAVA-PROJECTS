package practice;
import java.util.*;
public class ifelseExample2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter either yes or no");
		String str=sc.nextLine();
        if(str.equals("yes")) {
        	System.out.println("need of umbrella");
        }
        else {
        	System.out.println("no need of umbrella");
        }
        sc.close();
	}

}
