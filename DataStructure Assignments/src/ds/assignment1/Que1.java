package ds.assignment1;

import java.util.Scanner;

public class Que1 {
	Scanner sc=new Scanner(System.in);
	int size;
	int arr[];
	Que1(){}
	Que1(int size){
	    
	this.size=size;
	arr=new int[size];
	}
	void addElement()
	{
	    for(int i=0;i<size;i++)
	    {
	    int x=sc.nextInt();
	    arr[i]=x;
	    }


	}
	void display(int size)
	{
	for(int x=0;x<size;x++)
	{
	System.out.println(arr[x]);
	}

	}
	int delete(int x)
	{ int i;

	for(int j=x-1;j<size-1;j++)
	{
	arr[j]=arr[j+1];

	}
	size--;
	System.out.println(size);
	return size--;
	  
	}


	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size of array");
	 int a=sc.nextInt();
	 Que1 Arr=new Que1(a);   
	 System.out.println("Add elements");
	Arr.addElement();
	System.out.println("display elements");
	Arr.display(a);
	System.out.println("enter index/position that you want to delete");
	int x=sc.nextInt();
	int b=Arr.delete(x);
	System.out.println("after deletion display array elements");
	Arr.display(b);

	}
}
