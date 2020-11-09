package opps.ClassObjectInheritance;

import java.util.Scanner;

class Product{
	private int pid;
	private double price;
	private int quantity;
	
	public Product() {	}
	
	public Product(int pid, double price, int quantity) {
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public static void findPid(Product[] p) {
		double high_price = 0;
		int high_pid=0;
		for(int i=0; i<p.length; i++)
		{
			if(p[i].price>high_price)
			{
				high_price=p[i].price;
				high_pid=p[i].pid;
			}
		}
		System.out.println("Pid of product having high price is :"+high_pid);
	}
	
	public static double totalAmount(Product[] p) {
		double total_price = 0;
		double cal=0;
		for(int i=0; i<p.length; i++)
		{
			cal=p[i].price * p[i].quantity;
			total_price=total_price + cal;
		}
		return total_price;
	}
}

public class ProductDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product[] parr = new Product[5];
		for(int i=0; i<parr.length; i++)
		{
			System.out.println("Enter pid , price & quantity of product: "+(i+1));
			int pid=sc.nextInt();
			double price=sc.nextDouble();
			int quantity=sc.nextInt();
			parr[i]=new Product(pid, price, quantity);
		}
		
		Product.findPid(parr);
		System.out.println("Total amount spent on all product is :"+Product.totalAmount(parr));
	}

}
