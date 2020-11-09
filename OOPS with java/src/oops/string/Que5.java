//Write a program which prints the length
//of each word in a sentence

package oops.string;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=0; i<str.length(); i++)
		{
			String s="";
			while(i<ch.length && ch[i] != ' ')
			{
				s=s+ch[i];
				i++;
			}
			if(s.length()>0)
				System.out.println(s+": "+s.length());
		}
	}

}
