import java.util.*;

public class Que11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter two numbers to swap: ");
		int a = sc.nextInt();		
		int b = sc.nextInt();
		System.out.println("Before Swapping :");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before Swapping :");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
}