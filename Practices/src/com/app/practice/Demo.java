package com.app.practice;

class DemoTest {
  DemoTest demo;
}

class Demo {

	public String display() {
		System.out.println("Main method");
		return "mickey";

	}

	public Object display(Object obj) {
		System.out.println("Child method");
		return obj ;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.display();
	}
}