package opps.ClassObjectInheritance;


class Employee{
	private static int empNo=100;
	private double salary;
	private static double totalSalary;
	

	public Employee(double salary) {
		this.salary=salary;
		empNo=empNo+1;
		totalSalary=salary+totalSalary;
	}
	
	public static void showData()
	{
		System.out.println("Total Employe Number: "+(empNo-100));
		System.out.println("Total Salary of all Employees: "+totalSalary);
	}
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(1000);
		Employee e2=new Employee(2000);
		Employee e3=new Employee(6000);
		Employee.showData();
;	}

}
