//Write a function which accepts an floating point number and counts the number of decimal
//places in the number without using a string.

package oops.assignment3;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Value");
		double d= sc.nextDouble();
		int count=0;
		while(d!=(int)d)
		{
			d=d*10;
			count++;
		}
		System.out.println("Digits after decimal point are: "+count);
	}

}
