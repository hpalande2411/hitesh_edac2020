//WAP to define a class Employee with attributes id, name ,designation  accept data for 
//	5 objects and display employee details whose designation is Manager.

package oops.assignment4;

import java.util.Scanner;

class Employee{
	static private int id;
	static private String name,designation;
	
	//public Employee() {	}
	
	public Employee(int id, String name, String designation) {
		this.id=id;
		this.name=name;
		this.designation=designation;
	}
	
	public static void getData()
	{
		System.out.println("Details of Employee: ");
		System.out.println("E. Id: "+id);
		System.out.println("E. Name: "+name);
		System.out.println("E. Designation: "+designation);
	}
	
	public static void getArray(Employee[] emp)
	{
		String d;
		for(int i=0; i>emp.length; i++)
		{
			d=emp[i].designation;
			if(d.equals("Manager"))
			{
				getData();
			}
			else {
				continue;
			}
		}
		
	}
	
}


public class Que4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee[] e = new Employee[5];
		
		e[0]=new Employee(1, "ABC", "Developer");
		e[1]=new Employee(2, "HP", "Manager");
		e[2]=new Employee(3, "XYZ", "Developer");
		e[3]=new Employee(4, "PQR", "Tester");
		e[4]=new Employee(5, "ASA", "Manager");
		
		Employee.getArray(e);
		
	}

}
