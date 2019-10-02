/**
* SquareTester is a JUnit tester class that tests all public methods of Square
*/

public class SquareTester {
	public static void main(String[] args) {
		//Constructor
		System.out.println("This test will operate on a square with side lengths of 5.0");
		Square square1 = new Square(5.0);
		Square square2 = new Square(5.0);
		System.out.println("Testing getLength() from Rectangle class: " + square1.getLength());
		System.out.println("Testing getHeight() from Rectangle class: " + square1.getHeight());
		System.out.println("Testing area(): " + square1.area());
		System.out.println("Testing perimeter(): " + square1.perimeter());
		System.out.println("Testing overridden equals() method: " + square1.equals(square2));
		System.out.println("Testing overridden toString() method: ");
		System.out.println(square1.toString());
	}
}
