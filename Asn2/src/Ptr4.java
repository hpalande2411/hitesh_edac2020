import java.util.*;

public class Ptr4 {
	public static void main (String args[]) {

	System.out.println("Enter number");
	Scanner sc = new Scanner(System.in);
	
	int n=sc.nextInt();

	for(int i=1; i<=n; i++)
	{
		int k=1;
		for(int j=1; j<=2*n-1; j++)
		{
			if(j>=n+1-i && j<=n-1+i)
		{
				System.out.print(k);
				if(j<n)
					k++;
				else
					k--;
		}
			else
				System.out.print(" ");
		}
		System.out.println();
		}

	}
}