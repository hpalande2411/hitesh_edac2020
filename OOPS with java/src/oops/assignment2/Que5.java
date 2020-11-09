//Prime numbers between two intervals

package oops.assignment2;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int  i, flag;
		 
	        System.out.println("Enter two interval: ");
	        int a = sc.nextInt();
		    int b = sc.nextInt(); 
	 
	        System.out.printf("Prime numbers between "+a+" and "+b+" are:");
	 
	        for (i = a; i <= b; i++) {
	 
	            if (i == 1 || i == 0)
	                continue;
	 	            flag = 1;
	 
	            for (int j = 2; j <= i / 2; ++j) {
	                if (i % j == 0) {
	                    flag = 0;
	                    break;
	                }
	            }
	 
	            if (flag == 1)
	                System.out.println(i);
	        }
	}

}
