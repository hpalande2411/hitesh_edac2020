//check no. is prime or not

package oops.assignment2;

import java.util.Scanner;

public class Que3 {

	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int flag=0;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			flag = 1;
		}
		
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
