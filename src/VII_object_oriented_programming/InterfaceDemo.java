package VII_object_oriented_programming;

import java.awt.Rectangle;

interface Shape {
	int length=10; // final & static
	int width=20; // final & static
	
	void circle(); // static method
	
	default void square() {
		System.out.println("this is default mehtod");
	}
	
	static void rectangle() {
		System.out.println("this is static method");
	}
	
}

public class InterfaceDemo implements Shape {
	
	public void circle() {
		System.out.println("abstract method");
	}
	
	public static void main(String[] args) {
		InterfaceDemo idobj=new InterfaceDemo();
		idobj.circle();
		idobj.square();
		Shape.rectangle(); // indirectly get it in class
		System.out.println(length);
		System.out.println(width);
	}

}
