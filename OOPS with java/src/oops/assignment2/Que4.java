//WAP to print series: 12+22+32+42+.....+n2

package oops.assignment2;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter end value of series: ");
		String num = sc.next();
		
		String n=num.substring(0,num.length()-1);
		
		int mynum=Integer.parseInt(n);
		System.out.println(mynum);
		
		int copy = (mynum*10)+2;
		System.out.println("Your input "+num+" is modified to "+copy+" to calculate series.");
		System.out.println("End value of series is :"+copy);
		//System.out.println(copy);
		int sum=0;
		for(int i=12; i<=copy; i+=10)
		{
			sum=sum+i;
		}
		System.out.println("Sum of series is: "+sum);
	}

}
