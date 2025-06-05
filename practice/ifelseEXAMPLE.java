package practice;
import java.util.*;
public class ifelseEXAMPLE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter either true or false");
		boolean isRaining=sc.nextBoolean();
        if(isRaining=true) {
        	System.out.println("need of umbrella");
        }
        else {
        	System.out.println("no need of umbrella");
        }
        sc.close();
	}

}
