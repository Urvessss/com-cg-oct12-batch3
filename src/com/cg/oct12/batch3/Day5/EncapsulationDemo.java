package com.cg.oct12.batch3.Day5;
//Encapsulation
//Binding data member with methods
//to secure data
//make fields as private
//make public methods to access those field
//for Entity classes always:
//create private fields
//Generate defulat constructor,full prameterized constructor,getters-setters and tostring
public class EncapsulationDemo {
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		System.out.println(emp.getSalary());
		//emp.salary=10000;
		emp.setSalary(10000);
		System.out.println(emp.getSalary());
		
		
	}

}
