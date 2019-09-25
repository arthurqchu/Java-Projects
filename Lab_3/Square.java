/**
* Square class creates and operates on squares; extends Rectangle
*/
public class Square extends Rectangle {
	private double length;
	/**
	* Constructor that uses constructor from Rectangle
	*/
	//Constructor
	public Square(double length) {
		super(length, length);
	}
	/**
	* Returns string "Square" for squares
	*/
	//Abstract methods
	@Override
	public String getShape() {
		return "Square";
	}
	/**
	* Returns area for squares
	*/
	@Override
	public double area() {
		return this.length * this.length;
	}
	/**
	* Returns perimeter for square
	*/
	@Override
	public double perimeter() {
		return 4 * this.length;
	}
	/**
	* Displays information about square
	*/
	@Override
	public void display() {
		System.out.println("Shape: " + getShape());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
