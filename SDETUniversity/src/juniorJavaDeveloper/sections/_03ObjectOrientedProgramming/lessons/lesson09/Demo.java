package juniorJavaDeveloper.sections._03ObjectOrientedProgramming.lessons.lesson09;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemai.com";
		person1.phone = "7897894564";
		
		// Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		/*
		// Person
		
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemai.com";
		String phone = "7897894564";
		
		// Action, activity, behavior
		// System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testemai.com";
		String phone2 = "1111111111";
		
		// Action, activity, behavior
		// System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
	}
	
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}


}