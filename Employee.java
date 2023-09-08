package raja;

public class Employee {
	private int Emp_ID;
	private String Emp_Name;
	private String Company;
	private double Emp_Salary;
	public Employee(int emp_ID, String emp_Name, String company, double emp_Salary) {
		super();
		Emp_ID = emp_ID;
		Emp_Name = emp_Name;
		Company = company;
		Emp_Salary = emp_Salary;
	}
	@Override
	public String toString() {
		return "\nEmployee [Emp_ID=" + Emp_ID + ", Emp_Name=" + Emp_Name + ", Company=" + Company + ", Emp_Salary="
				+ Emp_Salary + " ]";
	}
	public int getEmp_ID() {
		return Emp_ID;
	}
	public void setEmp_ID(int emp_ID) {
		Emp_ID = emp_ID;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public double getEmp_Salary() {
		return Emp_Salary;
	}
	public void setEmp_Salary(double emp_Salary) {
		Emp_Salary = emp_Salary;
	}
	
	
}