/**
* SquareTester is a JUnit tester class that tests all public methods of Square
*/

public class SquareTester {
	public static void main(String[] args) {
		//Constructor
		Square square = new Square(5.0);

		System.out.println("This test will operate on a square with side lengths of 5.0");
		System.out.println("Testing getShape(): " + square.getShape());
		System.out.println("Testing area(): " + square.area());
		System.out.println("Testing perimeter perimeter(): " + square.perimeter());
		System.out.println("Testing display(): ");
		square.display();
	}
}
