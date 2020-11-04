import java.util.*;

public class Que14{
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a year: ");
	 int yr =  sc.nextInt();
	 if((yr % 400 == 0 ) || (yr % 4 ==0 && yr % 100 != 0))
	 System.out.println("Leap year");
	 else
	 System.out.println("Not a Leap Year");
	}
}