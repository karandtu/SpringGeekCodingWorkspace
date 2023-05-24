package com.springmodules.springcoding;

import org.junit.*;


public class EmployeeTest {

	
	public static class EmployeeBuilderTest {
		private String name;
		private String age;
		private String department;
	}
	
	
	
	@Test
	public void testThatEmployeeHasAllCorrectFieldsSet() {
		String name ="Harkaran Sidhu";
		String age ="31";
		String department = "Physics and Astronomy";
		
		Assert.assertEquals("Name of Harkaran Sidhu is correct", name, name);
		Assert.assertEquals("Age of Harkaran Sidhu is correct", age, age);
		Assert.assertEquals("Department of Harkaran Sidhu is correct", department, department);
		

	}
}
