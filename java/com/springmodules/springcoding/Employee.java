package com.springmodules.springcoding;

public class Employee {

	private final String name;
	private final String age;
	private final String department;

	//make constructor private to restrict instantiation of Employee class to create any object for us.
	public Employee(String name, String age,String department) {
		this.name=name;
		this.age=age;
		this.department=department;
	}


	private static class EmployeeBuilder {
		private String name;
		private String age;
		private String department;

		
	public EmployeeBuilder setName(String name) {
		this.name=name;
		return this;
	}
	
	public EmployeeBuilder setAge(String age) {
		this.age=age;
		return this;
	}
	
	public EmployeeBuilder setDepartment(String department) {
		this.department=department;
		return this;
	}
	

		public Employee build() {
			return new Employee(name,age,department);
		}

	}
	
	
	
	Employee.EmployeeBuilder callEmployeeFromBuilderObject = new Employee.EmployeeBuilder();
	//Create an employee object through builder instance
	Employee employeeObject = callEmployeeFromBuilderObject.setName("Harkaran Sidhu").setAge("31").setDepartment("Physics and Astronomy")
			.build();
}
