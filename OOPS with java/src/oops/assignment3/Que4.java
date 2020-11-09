//Given an array of integers, print whether the numbers are in ascending order or in descending
//order or in random order without sorting 

package oops.assignment3;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of an array: ");
		int len = sc.nextInt();
		int i=0;
		int f=0,mf=0;
	//	int prev,middle,next;
		
		int[] arr = new int[len];
		System.out.println("Enter "+len+" elements: ");
		for( i=0; i<arr.length; i++)
		{
			//System.out.println("Enter an element at "+i+" position");
			arr[i]=sc.nextInt();
		}
		
		/*for(i=0; i<arr.length;i++)
		{	
			//if((arr[i]<arr[i+1] && arr[len-2]<arr[len-1]) || (arr[i]>arr[i+1] && arr[len-2]>arr[len-1]))
				//flag=0;
			if( arr[i]>arr[i+1])
				flag=1;
			else if( arr[i]<arr[i+1] )
				flag=2;
			else {
				flag=3;
			}
		}*/
		
		while((f==1 || mf==1) && i<len-1)
		{
			if(arr[i]<arr[i+1])
				f=1;
			else if(arr[i]>arr[i+1])
				mf=1;
			i++;
		}

		if(f==1)
			System.out.println("Array is in Asecnding order");
		else if(mf==1)
			System.out.println("Array is in Descending order");
		else
			System.out.println("Array is in Random order");
		
		
		
	}

}
