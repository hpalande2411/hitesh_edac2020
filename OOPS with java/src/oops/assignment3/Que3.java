//Write a program which generates the series 1,4,27,16,125,36

package oops.assignment3;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of series: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print((i*i)+" ");
			else {
				System.out.print((i*i*i)+" ");
			}
		}
	}

}
