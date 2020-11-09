//Reverse the array elements

package oops.assignment2;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int x=arr.length;
		System.out.println("Enter 10 numbers :");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Array elements in reverse order:");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}
	}


