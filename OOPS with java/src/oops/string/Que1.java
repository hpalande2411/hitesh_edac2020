//Write a program which takes a string and prints the number of vowels, consonants(non-vowels).
//numbers and other characters.

package oops.string;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		int v=0,c=0,d=0,s=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
			{
				ch=Character.toLowerCase(ch);
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					v++;
				else 
					c++;
			}
			
			else if(ch >='0' && ch<='9')
				d++;
			else
				s++;
		}
		
		System.out.println("Vowels: "+v);
		System.out.println("Consonant: "+c);
		System.out.println("Digit: "+d);
		System.out.println("Special Char: "+s);
		
	}

}
