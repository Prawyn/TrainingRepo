package org.cap;

public class MainClass {

	public static void main(String[] args) {
		greetings();
	}
	
	public static void greetings(){
		SlaesClass obj = new SlaesClass();
		System.out.println("Hello My First App");
		System.out.println("Good Afternoon!");
		obj.display();
	}

}
