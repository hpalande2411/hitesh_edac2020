package opps.ClassObjectInheritance;


class Faculty{
	protected int facultyid;
	protected double salary;
	
	public void input(int facultyid) {
		this.facultyid=facultyid;
	}
	
	public void printSalary() {
		System.out.println("Salary: "+salary);
	}
}


class FullTimeFaculty extends Faculty{
	private double basicSalary, allowance;
	
	public void input(double allowance, int facultyid) {
		super.input(facultyid);
		this.basicSalary=basicSalary;
		this.allowance=allowance;
	}
	
	public void calculateSal() {
		salary=basicSalary+allowance;
	}
}

class PartTimeFaculty extends Faculty{
	private int working_hrs; 
	private double ratePerHr;
	
	public void input(int working_hrs, double ratePerHr ){
		super.input(facultyid);
		this.working_hrs=working_hrs;
		this.ratePerHr=ratePerHr;
	}
	
	public void calculateSal() {
		salary = working_hrs + ratePerHr;
	}
}

public class FacultyDemo {

	public static void main(String[] args) {

	}

}
