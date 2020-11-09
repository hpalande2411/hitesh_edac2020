//Array elements in decending order

package oops.assignment2;

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		System.out.println("Enter 10 numbers :");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int t;
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("Array elements in descending order:");
		for(int element:arr)
		{
			System.out.println(element);
		}
	}

}
