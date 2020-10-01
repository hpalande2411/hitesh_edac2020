import java.util.Scanner;

public class Ptr1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of line to print");
		int n =sc.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			int flag=1;
			int k=1;
			for (int j=1;j<=2*n-1;j++)
			{
				if(j>n-i && j<n+i && flag==1 )
				{
					System.out.print(i);
					k++;
					flag=0;
				}
				else if (flag==0)
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
			System.out.println();
		}
		
		
	}

}
