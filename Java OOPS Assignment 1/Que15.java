import java.util.*;

public class Que15{
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Your gender and age:");
	 System.out.println("Gender:");
	 char gender = sc.next().charAt(0);
	 System.out.println("Age:");
	 int age = sc.nextInt();

	if((gender=='m' && age>=21)||(gender=='f' && age>=18))
	 System.out.println("Eligible for marriage");
        else
	 System.out.println("Utavla navra, gudghyala bashing..!!!");
	
	}
}