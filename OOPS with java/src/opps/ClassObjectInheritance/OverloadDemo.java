package opps.ClassObjectInheritance;

class MyMathOperation{
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public float multiply(float a, float b, float c) {
		return a*b*c;
	}
	
	public int multiply(int[] a) {
		int mul=1;
		for(int i=0; i<a.length; i++)
		{
			mul=mul*a[i];
		}
		return mul;
	}
	
	public double multiply(double a, int b) {
		return a*b;
	}
}


public class OverloadDemo {

	public static void main(String[] args) {
		MyMathOperation m=new MyMathOperation();
		int arr[]= {3,5,1,5,4};
		System.out.println(m.multiply(2,4));
		System.out.println(m.multiply(2.4f,6.54f,32.544f));
		System.out.println(m.multiply(arr));
		System.out.println(m.multiply(231.5, 43));
		
	}

}
