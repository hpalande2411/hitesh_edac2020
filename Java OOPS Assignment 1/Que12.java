import java.util.*;

public class Que12{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary: ");
		double bs = sc.nextDouble();
		
		double hra, da, gs;
		if(bs<10000)
		{
		 hra = (bs/100)*10;
		 da = (bs/100)*90;
		 gs = bs + da + hra;
		 System.out.println("Your Gross Salary: "+gs+"/-");
		}
		else
		{
		 hra = 2000;
		 da = (bs/100)*98;
		 gs = bs + da + hra;
		 System.out.println("Your Gross Salary: "+gs+"/-");
		}
	
	}

}