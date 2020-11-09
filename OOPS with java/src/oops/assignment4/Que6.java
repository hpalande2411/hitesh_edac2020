//Write a program Complex number to add the real and imaginary
//part for 2 complex numbers

package oops.assignment4;

class Complex{
	private double real;
	private double img;
	
	public Complex() {}
	
	public Complex(double r, double i) {
		real=r;
		img=i;
	}
	
	static public void sum(Complex n1, Complex n2) {
		Complex temp=new Complex();
		temp.real=n1.real+n2.real;
		temp.img=n1.img+n2.img;
		
		System.out.println("Real part: "+temp.real);
		System.out.println("Imaginary part: "+temp.img);
	}
}
public class Que6 {

	public static void main(String[] args) {
		Complex c1=new Complex(3,6);
		Complex c2=new Complex(3.7, 4.09);
		Complex.sum(c1, c2);
		}

}
