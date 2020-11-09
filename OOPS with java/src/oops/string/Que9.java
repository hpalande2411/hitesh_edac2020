//Write a program which accepts two string and prints all unique characters which are common in
//both stirngs.

package oops.string;

import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st  String: ");
		String str1=sc.nextLine();
		
		System.out.println("Enter 2nd  String: ");
		String str2=sc.nextLine();
		
		int n=26;
		
		int present[]=new int[26];
		for(int i=0; i<n; i++)
			present[i]=0;
		
		
		for(int i=0; i<str1.length();i++)
			present[str1.charAt(i)-'a']=1;
		
		for(int i=0; i<str2.length();i++)
		{
			if(present[str2.charAt(i)-'a']==1 || present[str2.charAt(i)-'a']==-1 )
			{
				present[str2.charAt(i)-'a']=-1;
			}
			else {
				present[str2.charAt(i)-'a']=2;
			}
	
		}
		
		
		System.out.println("Unique alphabets in both strings: ");
		for (int i = 0; i < n; i++) 
        { 
            if (present[i] == 1 || present[i] == 2)  
            { 
                System.out.print((char) (i + 'a') + " "); 
            } 
        } 
	}
	

}
