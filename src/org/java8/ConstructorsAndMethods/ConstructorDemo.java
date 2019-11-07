package org.java8.ConstructorsAndMethods;

public class ConstructorDemo {

	public static void main(String[] args) {
		StudentInterface stud = Student::new;
		stud.getObject();
	}
	
	
}
interface StudentInterface{
	
	Student getObject();
	
}
class Student {

	public Student() {
		super();
		System.out.println("Student created");
	}
	public Student(int xid) {
		super();
		System.out.println("Student Created with id" + xid);
	}
	
}