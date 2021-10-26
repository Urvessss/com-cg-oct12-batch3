package com.cg.oct12.batch3.Day4;
/*
 * constructor - 
 * name is same as class name 
 * it is a special type of method 
 * it does not have a return type 
 * it is used to create and initialize an object of the class 
 * by default JVM provides a zero-arg constructor 
 * we also can define constructors 
 * but if we define a constructor, JVM will not provide any constructor
 * a class can have one or more constructors  
 * 
 */

class Employee {

	int eid;
	String name;
	double salary;

	public Employee() {
		System.out.println("zero-args constructor");

	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterized constructor");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "Urvesh";
		emp.salary = 10.5;
		// stem.out.println(emp.eid + " " + emp.name + " " + emp.salary);
		System.out.println(emp.toString());

		Employee emp2 = new Employee();
		emp2.eid = 109;
		emp2.name = "Patil";
		emp2.salary = 10.6;
		System.out.println(emp2.toString());
		// stem.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);

		Employee emp3 = new Employee(103, "Rahul", 33.44);
		System.out.println(emp3.toString());
		// stem.out.println(emp3.eid + " " + emp3.name + " " + emp3.salary);
	}
}