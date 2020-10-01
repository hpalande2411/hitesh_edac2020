import java.util.*;

public class Ptr7 {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			int flag=1;
			int  k=2*n-1;

			for(int j=1; j<=k;j++)
			{
				if(j>=i && j<=k-i+1 && flag==1)
				{
					System.out.print(n+1-i);
					flag=0;
				}
				else if(flag==0)
				{
					System.out.print(" ");
					flag=1;
				}
				else
				{
					System.out.print(" ");
					flag=1;
				}
			}
		System.out.print("\n");
		}


	}

}
