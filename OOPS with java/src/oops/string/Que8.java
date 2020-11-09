//Write a program to reverse a string.

package oops.string;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str1=sc.nextLine();
		
		char[] ch1=str1.toCharArray();
		
		for(int i=ch1.length-1; i>=0; i--)
		{
			System.out.print(ch1[i]);
		}
	}

}
