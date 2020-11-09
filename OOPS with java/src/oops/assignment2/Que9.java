//Search an element in an array
package oops.assignment2;

import java.util.Scanner;

import javax.swing.text.Position;

public class Que9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int x=arr.length;
		System.out.println("Enter 10 numbers :");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter an element to search in array: ");
		int search = sc.nextInt();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==search) {
				System.out.println("Element "+arr[i]+" found at "+i+"th position" );
				break;
			}
			else {
				continue;
			}
		}
	}

}
