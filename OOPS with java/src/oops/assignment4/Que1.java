//WAP to define a class Student with attributes rollno, name ,marks accept data for 2 objects and display them.
package oops.assignment4;

class Student{
	private int rollno;
	private String name;
	private double marks;
	
	public void acceptData(int rollno, String name, double marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void displayData()
	{
		System.out.println("Roll No.:"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Marks :"+marks);
	}
	
}

public class Que1 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.acceptData(101, "Ram", 56.76);
		s1.displayData();
		
		Student s2 = new Student();
		s2.acceptData(102, "Sham", 53.86);
		s2.displayData();
	}

}
