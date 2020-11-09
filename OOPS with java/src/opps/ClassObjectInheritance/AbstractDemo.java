package opps.ClassObjectInheritance;

import java.util.Scanner;

abstract class Processor{
	protected int data;
	
	public void showData()
	{
		System.out.println(data);
	}
	
	public abstract void process(int n);
}

class Factorial extends Processor{
	public void process(int n) {
		super.data=n;
		int fact=1;
		for(int i=1;i<=data;i++)
			fact=fact*i;
		
		System.out.print(fact);
	}
}


class MCircle extends Processor{
	public void process(int n) {
		super.data=n;
		float area = (22/7)*data*data;
		System.out.print(area);
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Factorial f	= new Factorial();
	MCircle c = new MCircle();
	
	System.out.println("Enter a number for factorial: ");
	int n1=sc.nextInt();
	System.out.println("Factorial is: ");
	f.process(n1);
	
	System.out.println("\n\nEnter a radius of circle: ");
	int n2=sc.nextInt();
	System.out.println("Area is: ");
	c.process(n2);
	
	}

}





