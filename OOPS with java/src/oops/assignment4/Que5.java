//WAP to define Class Simpleinterest with attributes principalamount, 
//	 rate of interest static ,number of years calculate SI and display it. 

package oops.assignment4;

import java.util.Scanner;

class SimpleInterest{
	private double principle_amt;
	private static double roi=4.6;
	private int year;
	private double interest;
	
	public void setData(double pa, int y){
		principle_amt=pa;
		//roi=r;
		year=y;
	}
	
	public void getInterest() {
		interest=(principle_amt*roi*year)/100;
		System.out.println("Simple interest :"+interest);
	}
}


public class Que5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleInterest s = new SimpleInterest();
	
		System.out.println("Enter principle amount: ");
		double p=sc.nextDouble();
		System.out.println("Enter Year: ");
		int y=sc.nextInt();
		
		s.setData(p, y);
		s.getInterest();
	}

}
