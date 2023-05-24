package com.springmodules.springcoding;

 class MyStaticInitializerBlockClass {

	 static int staticVariable;
	 static {
		 System.out.println("Creating my first static block");
		 staticVariable = 10;
	 }
	 
	 static void staticMethod() {
		 System.out.println("From staticMethod");
		 System.out.println(staticVariable);
	 }
 
	 
	 public static class MainClass{
		 
		 static {
			 System.out.println("executing MyStaticInitializerBlockClass from the MainClass");
		 }
		 
		 public static void main(String args[]) {
			 MyStaticInitializerBlockClass.staticVariable= 25;
			 MyStaticInitializerBlockClass.staticMethod();
			 
		 }
	 }
}
