import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int days = sc.nextInt();
		
		int year,month,week,day;
		year = days / 365;
		System.out.println(year+" year(s)");
		
		month = days % 365;
		int m = month / 30;
		System.out.println(m+ " month(s)");
		week = month % 30;
		
		int w = week / 7;
		System.out.println(w+" week(s)");
		day = week % 7;
		
		System.out.println(day+" day(s)");
		
	}

}