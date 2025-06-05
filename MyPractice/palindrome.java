package MyPractice;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int rem,rev=0,m=n;
		while(n>0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==m){
			System.out.println("it is a palindrome");
		}
		else{
			System.out.println("it is not a palindrome");
		}
		sc.close();
		
	}

}