// Inheritance - Parent Child Relationship
class Parent{
	String fname;
	String lname;
	int wealth;
	Parent(){
		System.out.println("[Parent] Object Constructed");
		fname = "John";
		lname = "Watson";
		wealth = 20000;
	}
	void show() {
		System.out.println("[Parent] Details: "+fname+" "+lname+" "+wealth);
		
	}
	
	//we use extend keyword to inherit parent class
}
class Child extends Parent{
	String fname;
	int wealth;
	String companyName;
	Child(){
		System.out.println("[Child] Object Constructed");
		fname = "Fionna";
		wealth = 10000;
		companyName = "ABC Ltd";
	}
	//Overiding = redefining the same method as of parent 
	void show() {
		
		//super.show();
		System.out.println("[Child] Details: "+fname+" "+lname+" "+wealth+" "+companyName);
	}
}
public class WhatisInheritance {

	public static void main(String[] args) {
		Parent pRef = new Parent();
		pRef.show();
		System.out.println("*``````````````````````````*");
		Child cRef  = new Child();
		cRef.show();

	}

}
