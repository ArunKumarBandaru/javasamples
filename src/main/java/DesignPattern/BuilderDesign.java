package DesignPattern;

public class BuilderDesign {
	public static void main(String args[]) {
		SampleEmployeeBuilder sampleBuilder  = SampleEmployeeBuilder.Builder.getInstance().setName("Arun").setDept("CSE").setSalary(0).build();	
		System.out.println(sampleBuilder.getDept());
	}
}

class SampleEmployeeBuilder {
	
	String name = null;
	int age;
	String dept;
	int salary;
	
	public SampleEmployeeBuilder() {
		
	}
	
	SampleEmployeeBuilder(Builder builder) {
		this.name = builder.getName();
		this.age = builder.getAge();
		this.dept = builder.getDept();
		this.salary = builder.getSalary();
	}
	
	 static class Builder {
		String name = null;
		int age;
		String dept;
		int salary;
		
		static Builder getInstance() {
			return new Builder();
		}
		
		public SampleEmployeeBuilder build() {
			return new SampleEmployeeBuilder(this);
		}
		
		public String getName() {
			return name;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public int getAge() {
			return age;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public String getDept() {
			return dept;
		}

		public Builder setDept(String dept) {
			this.dept = dept;
			return this;
		}

		public int getSalary() {
			return salary;
		}

		public Builder setSalary(int salary) {
			this.salary = salary;
			return this;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}