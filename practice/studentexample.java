package practice;

import java.util.HashSet;
import java.util.Scanner;

public class studentexample {

	public static void main(String[] args) {
		HashSet<String> student= new HashSet<>();
		Scanner sc= new Scanner(System.in);
       while(student.size()<5) {
        	System.out.println("enter name "+i+ ":" );
        	String str= sc.nextLine();
        	student.add(str);
        	if(!student.add(name)) {
        		System.out.println("names are already");
        	}
        	
        	
        }System.out.println("names are");
        for(String stu:student) {
        System.out.println(stu);
        }
        
	sc.close();

}
}
