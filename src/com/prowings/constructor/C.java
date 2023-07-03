package com.prowings.constructor;

public class C extends B {

	public C() {
		
		System.out.println("inside C() Constuctor");
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		
		System.out.println(c);
		
		
	}
}
