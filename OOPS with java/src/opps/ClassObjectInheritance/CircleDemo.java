package opps.ClassObjectInheritance;

import java.util.Scanner;

class Circle{
	private double radius;
	private double area;
	
	public void init(double r) {
		radius=r;
	}
	
	public void calculateArea() {
		area=(22/7)*radius*radius;
	}
	
	public void display()
	{
		System.out.println("Radius :"+radius+"\nArea :"+area);
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Radius: ");
		double r=scanner.nextDouble();
		
		Circle c = new Circle();
		c.init(r);
		c.calculateArea();
		c.display();
	}

}
