import java.util.*;

public class Que8{
 
 public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter principle amount: ");
  double pa = sc.nextDouble();
  System.out.println("Enter rate of interest: ");
  double roi = sc.nextDouble();
  System.out.println("Enter time: ");
  int t = sc.nextInt();

  double si = (pa*roi*t)/100;
  System.out.println("SI :"+si);

 }
}