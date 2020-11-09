//Write a program to merge two arrays of integers by reading one number at a time from each array
//until one of the array is exhausted, and then concatenating the remaining numbers.


package oops.assignment3;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,k=0;
		System.out.println("Enter array length: ");
		int n1 = sc.nextInt();
		
		int[] a1=new int[n1];
		for(int i1=0; i1<a1.length; i1++)
		{
			//System.out.println("Enter an element at "+i+" position");
			a1[i1]=sc.nextInt();
		}
		
		System.out.println("Enter array length: ");
		int n2 = sc.nextInt();
		
		int[] a2=new int[n2];
		for(int i1=0; i1<a2.length; i1++)
		{
			//System.out.println("Enter an element at "+i+" position");
			a2[i1]=sc.nextInt();
		}
		

		int[] a3 = new int[n1+n2];
		while(i<n1 && j<n2) {
			a3[k++]=a1[i++];
			a3[k++]=a2[j++];
		}
		
		while(i<n1) {
			a3[k++]=a1[i++];
		}
		while(j<n2) {
			a3[k++]=a2[j++];
			
		}
		System.out.println("Resultant Array:");
		for(int elem : a3) {
			System.out.println(elem+" ");
		}
	}

}
