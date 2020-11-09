//Write a program which takes an array of integers and prints the running average of 3 consecutive
//integers. In case the array has fewer than 3 integers, there should be no output.

package oops.assignment3;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length: ");
		int len = sc.nextInt();
		
		int[] arr=new int[len];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter an element at "+i+" position");
			arr[i]=sc.nextInt();
		}
	
		double avg=0;
		
		int size=arr.length-3;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<=arr[size]){
				
				avg=(arr[i]+arr[i+1]+arr[i+2])/3;
				System.out.println("Average: "+avg);
			}else {
				System.out.println("No output");
			}
		}
		
	}

}
