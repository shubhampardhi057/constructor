package com.prowings.constructor;

public class Student {
	
	int rollno;
	String name;
	String address;
	
	public Student() {
		super();
	}

	public Student(int rollno,String name) {

		this(rollno,name,"Mumbai");
		
		System.out.println("student(int rno, String nm) -- invoked");
	}
	
	
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		
		System.out.println("student(String nm, int rno, String add) -- invoked"); 
	}
	
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		
		Student s = new Student(101,"Ram");
		
		System.out.println(s);
	}
	
	
	

}
