//Given a string, print the first non-repeating character in the string.

package oops.string;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
				 
		if(str.length()<2) {
			return;
		}
		
		for(Character ch: str.toCharArray())
		{
			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("Frist non repeating char: "+ch);
				break;
			}
		}
		
	}

}
