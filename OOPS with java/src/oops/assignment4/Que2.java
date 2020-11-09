//WAP to define a class Book with attributes id, name ,price accept data for 5 objects display book with highest price.

package oops.assignment4;

import java.util.Scanner;

class Book{
	private int id;
	private String name;
	private double price;
	
	
	public void setData(int id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	
	public static void highestPrice(Book[] b) {
		double high=b[0].price;
		String n="";
		for(int i=0; i<b.length; i++)
		{
			if(b[i].price>high) {
				high=b[i].price;
			n=b[i].name;
			}
		}
		System.out.println("Book with Higest price :"+high);
	}
	}

public class Que2 {

		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		double price;
		
		Book[] arr = new Book[5];
		
		for(int i=0; i<arr.length;i++)
		{
			
			System.out.println("Enter id, name and price of "+(i+1)+" book");
			arr[i]=new Book();
			//sc.next(); 
			
			id=sc.nextInt();
			name=sc.nextLine();
			price=sc.nextDouble();
			
			arr[i].setData(id, name, price);	
			
		}
		
		Book.highestPrice(arr);
		
		

	}
}
