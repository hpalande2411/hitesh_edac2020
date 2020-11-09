package opps.ClassObjectInheritance;


class Student{
	private int rollno;
	private String name;
	
	public void setData(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	public void showData()
	{
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+name);
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.setData(4, "Ram");
		s.showData();
	}

}
