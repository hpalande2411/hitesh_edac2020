import java.util.*;

public class Que10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit: ");
		float fah = sc.nextFloat();
		float cel = (5*(fah - 32)/9);
		System.out.println("Temperature in Celcius: "+cel);
}
}