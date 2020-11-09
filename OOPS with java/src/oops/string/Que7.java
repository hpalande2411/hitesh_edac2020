//Given a string , output another string where the 
//case of the characters is reversed.

package oops.string;

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		
		for(int i=0; i<str.length(); i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' )
			ch[i]= (char) (ch[i]+32);
			
			else if(ch[i]>='a' && ch[i]<='z' )
			ch[i]=(char) (ch[i]-32);
			
		}
		
		str=String.valueOf(ch);
		
		System.out.println(str);
		
	
		
		
		/*char a='a';
		char A=(char) (a-32);
		System.out.println(A);*/
	}
	

}
