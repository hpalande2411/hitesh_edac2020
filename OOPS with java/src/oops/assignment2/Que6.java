//sum and average of 10 array elements

package oops.assignment2;

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("Enter 10 numbers :");
		
		int sum=0;
		double avg;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			
		}
		System.out.println("Sum is: "+sum);
		avg=sum/arr.length;
		System.out.println("Average is: "+avg);
	}

}
