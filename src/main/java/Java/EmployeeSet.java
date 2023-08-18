package Java;

import java.util.HashSet;

public class EmployeeSet extends Object {
	
	private String fname;
	private String lname;
	private int age;
	
	private EmployeeSet(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public static void main(String args[]) {
		
		HashSet<EmployeeSet> set = new HashSet<EmployeeSet>();
		EmployeeSet empset = new EmployeeSet("arun", "kumar", 33);
		EmployeeSet empset1 = new EmployeeSet("arun", "kumar", 33);
		set.add(empset);
		set.add(empset1);
		
		System.out.println(set);
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int hashCode() {
		return this.getFname().hashCode() + this.getLname().hashCode() + this.getAge();
	}
	
	@Override
	public boolean equals(Object object) {
		System.out.println("Printing something in the console");
		EmployeeSet employeeSet = (EmployeeSet)object;
		if(this.getFname().equals(employeeSet.getFname()) && this.getLname().equals(employeeSet.getLname()) && this.getAge() == employeeSet.getAge()) {
			return true;
		}
		return false;
	}
}
