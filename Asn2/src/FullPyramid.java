
public class FullPyramid {

	public static void main(String[] args) {
int j,i;
		
		for (i=1;i<=4;i++)
		{
			int k=1;
			for (j=1;j<=7;j++)
				
			{
				if(j>=4-(i-1) && j<=4+(i-1) && k==1)
				
					{
						System.out.print("*");
						
						k=0;
		
					}
				else if(k==0)
				{	
					System.out.print(" ");
				k=1;
				}
				else
					
				{
					System.out.print(" ");
					k=1;
				}
				
			}
			
			System.out.println();
		}

	}

}
