import java.util.*;

public class HollwFullPyr {
public static void main(String []args)
{
	System.out.print("Enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=2*n-1;j++)
		{
			if(j==(n+1-i) || j==(n-1+i) || i==n)
				System.out.print("*");
			
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	
		sc.close();
}
}
