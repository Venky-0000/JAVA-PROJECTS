package MyPractice;

import java.util.Scanner;

public class BinarySearchSQRT {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();

		        if (n < 0) {
		            System.out.println("Square root of negative number is not defined for integers.");
		        } else {
		            int sqrt = integerSquareRoot(n);
		            System.out.println("Integer part of square root of " + n + " is: " + sqrt);
		        }

		        sc.close();
		    }
		    public static int integerSquareRoot(int n) {
		        int low = 0;
		        int high = n;
		        int ans = 0;

		        while (low <= high) {
		            int mid = low + (high - low) / 2;

		            if ((long) mid * mid <= n) {
		                ans = mid; // mid is a possible answer
		                low = mid + 1;
		            } else {
		                high = mid - 1;
		            }
		        }

		        return ans;
		    }
		}