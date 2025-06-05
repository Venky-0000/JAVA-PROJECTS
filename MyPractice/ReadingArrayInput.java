package MyPractice;
import java.util.*;
public class ReadingArrayInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println(array);
		sc.close();
	}

}
