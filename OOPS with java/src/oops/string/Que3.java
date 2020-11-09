//Write a function to replace multiple consecutive occurrences of 
//characters with a single character

package oops.string;

import java.util.Arrays;
import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		if(str.length()<2) {
			return;
		}
		
		int j=0;
		for(int i=0; i<str.length();i++)
		{
			if(ch[j] != ch[i])
			{
				j++;
				ch[j]=ch[i];
			}
			
		}
		System.out.println(Arrays.copyOfRange(ch, 0, j+1));
		
	}

}
