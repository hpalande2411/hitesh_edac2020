import java.util.*;
class Bank1{
	private String accname;
	private int accnum;
	private String acctype;
	private static double balance;
	private static String variable="DDB00AC";
	private String finalnum; 
	public void createAcc(String name,String type) {
		accname=name;
		acctype=type;
	}
		
	public void display()	{
		System.out.println("Account Holder's Name :"+accname);
		System.out.println("TYpe of Account : "+acctype);
	}
		public String index(int accdig) {
		String temp=String.valueOf(accdig);
		String hold= 	variable + temp;
		finalnum=hold;
		
			 return hold;
			 }
		public boolean gotAccount(String ig)
		{
			if (finalnum.equals(ig))
				return true;
			else
				return false;
		}
		
		public static void yourbalance(double b1) {
			balance=b1;
			
		}
		public static double yourbalance() {
			return balance;
			
			
		}
		
		public double deposit(double lele) {
			balance=lele+balance;
			
			return balance;
		}
		public double withdraw(double ghena) {
			if(balance<500) {
				System.out.println("Sorry.... Ypu can not Withdraw ..");
			}
			else
			balance=balance-ghena;
			
			
			return balance;
		}
		
		

		
	}
	
	




public class BankingProg {
	


	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Bank1 ar[]=new Bank1 [1];
		int n=0;
		while(n!=3) { 
			System.out.println("==================* *==================");
		 System.out.println("_________welcome to DE DE NA BANK_________");
		System.out.println("Select your Choice");
		System.out.println("1.Create a new Account \n2.Having an Existing Account \n3.Exit");
		System.out.println("==================* *==================");
		
		  n=sc.nextInt();
		
		switch (n){
		case 1:
			for(int i=0;i<ar.length;i++) {
				ar[i]=new Bank1();
				sc.nextLine();
			System.out.println("Enetr Your name");
			String name = sc.nextLine();
			
			System.out.println("Choose type of account");
			String type = sc.nextLine();
			ar[i].createAcc(name,type);
			ar[i].display();
			System.out.println("Your Account Number is : "+ ar[i].index(i));
			System.out.println("Make a payment of minimum Rs.500 to generate an account");
		
				double bl= sc.nextDouble();
				if (bl<500)
				{
					System.out.println("Your Account Balance is low please maintain balance minimum Rs.500");
				}
				else
				{
					ar[i].yourbalance(bl);
					System.out.println("Your account has created");
				}
			
	
			
			}
		break;	
		case 2:System.out.println("Enter Your Account Number");
		sc.nextLine();
		String acnum=sc.nextLine();
		boolean status;
		for(int i=0;i<ar.length;i++) {
			status =ar[i].gotAccount(acnum);
			if (status==true)
			{	int m=0;
			 while(m!=4) {
				
				System.out.println("Enter your choice ");
			System.out.println("1.Balance\n 2. deposit\n 3.withdraw\n 4.Exit");
			 m=sc.nextInt();
			
				switch(m) {
				case 1:System.out.println( "Your balance is "+ar[i].yourbalance());
				
					break;
					
				case 2:System.out.println("Enter amount to deposit");
				double dede=sc.nextDouble();
				System.out.println("Your account Balance is :"+ar[i].deposit(dede));
					
				break;
				
				case 3:
					System.out.println("Enter amount to Withdraw");
					double dena=sc.nextDouble();
					System.out.println("Your account Balance is :"+ar[i].withdraw(dena));
						
					
				break;
				
				case 4:
					System.out.println("return to main menu");
					break;
					
				}
			}
				
				
				
			}
			else
				System.out.println("invalid account");
			
		}
		
		
		break;
		
		case 3:System.out.println("Thanks For Visiting....Have a nice day....");
		break;
		
		
		}
		
		
		}
	}}

