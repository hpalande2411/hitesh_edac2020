//Print the third-largest number in an array without sorting it 

package oops.assignment3;

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length: ");
		int len = sc.nextInt();
		if(len<3)
		{
			System.out.println("Invalid array length");
			return;
		}
		int[] arr=new int[len];
		for(int i=0; i<arr.length; i++)
		{
			//System.out.println("Enter an element at "+i+" position");
			arr[i]=sc.nextInt();
		}
		
		int first = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>first)
				first=arr[i];
		}
		
		int second = Integer.MIN_VALUE;
		//System.err.println(second);
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>second && arr[i]<first )
				second=arr[i];
		}
		
		int third = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>third && arr[i]<second )
				third=arr[i];
		}
		
		System.out.println("Third highest element in array is: "+third);
	}

}
