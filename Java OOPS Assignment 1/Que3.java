public class Que3
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 20;
		int z = 30;
		
		y = (x*x)+(3*x)-7;
		System.out.println(y);
		
		y= x++ + ++x;
		System.out.println(y);

		z= x++ - --y - --x + x++;
		System.out.println(z);

		boolean x1=true;
		boolean y1=false;
		boolean z1;
		z1 = x1 && y1 || !(x1 || y1);
		System.out.println(z1);
	}
}