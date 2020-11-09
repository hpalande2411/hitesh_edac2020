package opps.ClassObjectInheritance;

import java.util.Scanner;

class MathOperation{
	//private int a,b;
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int subtract(int a, int b) {
		return a-b;
	}
	
	static int multiply(int a, int b) {
		return a*b;
	}
	
	static double power(int a, int b) {
		return Math.pow(a, b);
	}
	
}

public class Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		System.out.println("Add: "+MathOperation.add(a, b));
		System.out.println("Subtract: "+MathOperation.subtract(a, b));
		System.out.println("Multiply: "+MathOperation.multiply(a, b));
		System.out.println("Power: "+MathOperation.power(a, b));
	}

}
