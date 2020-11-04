import java.util.*;

public class Que7
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner (System.in);
  System.out.println("Enter marks in five subjects: ");
  double m1 = sc.nextDouble();
  double m2 = sc.nextDouble();
  double m3 = sc.nextDouble();
  double m4 = sc.nextDouble();
  double m5 = sc.nextDouble();
  
  double total = m1 + m2 + m3 + m4 + m5;
  double per = (total/500)*100;
  System.out.println(per);
 }
}