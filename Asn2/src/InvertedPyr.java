import java.util.Scanner;

public class InvertedPyr {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=n+1-i)
					System.out.print("*");
				
				else 
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}

