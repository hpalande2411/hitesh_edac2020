import java.util.*;

public class Ptr5{
   public static void main (String []args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a No");
	   int n=sc.nextInt();

	   for(int i=1; i<=n; i++)
	   {
		   int k=n+1-i;
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