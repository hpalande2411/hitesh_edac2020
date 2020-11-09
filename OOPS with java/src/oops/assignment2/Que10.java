//sum of even and sum of odd in an array

package oops.assignment2;

import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int x=arr.length;
		System.out.println("Enter 10 numbers :");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int se=0;
		int so=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				se=se+arr[i];
			else {
				so=so+arr[i];
			}
		}
		System.out.println("Sum of even elements is array: "+se);
		System.out.println("Sum of even elements is array: "+so);
	}
	
}
