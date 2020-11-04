import java.util.*;

public class Que6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r = sc.nextInt();
		
		System.out.println("Area: "+(3.14 * r *r));
		System.out.println("Circumference: "+(2+3.14*r));
	}
}