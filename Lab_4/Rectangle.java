/**
* Class for creating and operating on rectangles; extends Shape
*/
public class Rectangle extends Shape {
	private double length;
	private double width;
	/**
	* Constructor that uses superconstructor from Shape
	*/
	//Constructor
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	/**
	* Returns string "Rectangle" for rectangles
	*/
	//Abstract methods
	@Override
	public String getShape() {
		return "Rectangle";
	}
	/**
	* Returns area of rectangle
	*/
	@Override
	public double area() {
		return this.length * this.width;
	}
	/**
	* Returns perimeter for rectangle
	*/
	@Override
	public double perimeter() {
		return (2 * this.length) + (2 * this.width);
	}
	/**
	* Displays information about rectangle
	*/
	@Override
	public void display() {
		System.out.println("Shape: " + getShape());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
