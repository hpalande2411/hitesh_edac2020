import java.util.*;

public class HollowInvHalfPyramid {
public static void main(String []args) {
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1; i<=5; i++)
	{
		for(int j=1;j<=5; j++)
		{
			if(i==1|| j==1 ||j==(5+1-i))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}

		sc.close();
}
}
