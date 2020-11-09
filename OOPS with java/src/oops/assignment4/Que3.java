//WAP to define a class Bank accept customerid, name, balance write method  to perform deposit, checkbal, 
//withdraw keep min balance 1000.

package oops.assignment4;

import java.util.Scanner;

class Bank{
	Scanner sc = new Scanner(System.in);
	private int id;
	private String name;
	private static double balance;
	
	
	public void getData(int id, String name, double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	
	public void setBal(double bal) {
			balance=bal;
	}
	
	
	public void checkBalance()
	{
		System.out.println("Your account balance: "+balance);
	}
	
	public void depositAmount() 
	{   System.out.println("Enter amout to deposit: ");
		double amt=sc.nextDouble();
		System.out.println(amt+" has deposited in your account..!");
		balance=balance+amt;
		checkBalance();
	}
	
	public void withdrawAmount() 
	{
		 System.out.println("Enter amout to withdraw: ");
			double amt=sc.nextDouble();
			balance=balance-amt;
		if(balance<=1000) {
			System.out.println("Low Balance..!!! \nYou can't withdraw amount, minimum balance should be 1000/- Rs.");
			balance=balance+amt;
			checkBalance();
		}else {
			System.out.println(amt+" has withdrawn from your account..!");
			checkBalance();
		}
	}
}



public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bank b=new Bank();
		
		System.out.println("Enter Customer id, name and balance: ");
		int id=sc.nextInt();
		sc.next();
		String name=sc.nextLine();
		double balance=sc.nextDouble();
		
		
		b.getData(id, name, balance);
		
		double amt=0;
		int choice=0;
		while(choice!=4) {
		System.out.println("Choose Action:\n1)Check Balance \n2)Deposit Amount \n3)Withdraw Amount \n4)Exit");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			b.checkBalance();
			break;
			
		case 2:
			b.depositAmount();
			break;
			
		case 3:
			b.withdrawAmount();
			break;
			
		case 4:
			System.out.println("Thank You for visiting..!!");
			break;
			

		
	}	
		
	}}

}