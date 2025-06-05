package MyPractice;
import java.util.*;
public class BinarySearchExample {
	public static void main(String[] args) {
		int[] numbers = {2,8,3,4,5,7,9};
		int target=8;
		int left=0;
		int right=numbers.length-1;
		boolean found = false;
		int[] numbers2=Arrays.copyOf(numbers,numbers.length);
		Arrays.sort(numbers2);
		System.out.println("After Sorting the array:"+Arrays.toString(numbers2));
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers2[i]);
			if(i<numbers2.length-1) {
				System.out.print(",");
			}
			
		}
		while(left<=right) {
			int mid=(left+right)/2;
			if(numbers2[mid]==target) {
				System.out.println();
				System.out.println("Found "+target+" at index "+ mid);
				found=true;
				break;
			}
			else if(target<numbers2[mid]){
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		if(!found) {
			System.out.println("Number "+target+" not found");
		}
	}
}
