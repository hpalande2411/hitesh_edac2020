//Reverse the number

package oops.assignment2;

import java.util.Scanner;


public class Que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		int copy = n;
		int rev=0;
		while(n!=0)
		{
			int digit = n%10;
			rev = (rev*10)+digit;
			n = n/10;
		}
		System.out.println("Reverse is: "+rev);
	}

}
