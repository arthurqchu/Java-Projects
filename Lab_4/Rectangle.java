/**
 * A class used to create rectangles
 * from Lab 2
 */
public class Rectangle {
	private double length;
	private double height;
	private double rectangleID;
	public static int rectangleCount = 0;
	
	//Constructor
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
		this.rectangleID = rectangleCount;
		rectangleCount = rectangleCount + 1;
		return;
	}
	
	//Methods to alter rectangles
	public void setLength(double L) {
		this.length = L;
	}
	
	public void setHeight(double H) {
		this.height = H;
	}
	
	public double area() {
		return (this.length * this.height);
	}
	
	public double perimeter() {
		return ((2 * this.length) + (2 * this.height));
	}
	public double getRectangleID() {
		return this.rectangleID;
	}
	
	//Getters
	public double getLength() {
		return this.length;
	}
	
	public double getHeight() {
		return this.height;
	}
	/**
	 * Prints information about the rectangle
	 */
	@Override
	public String toString() {
		return "Shape: Rectangle" + "\nLength: " + getLength() + "\nHeight: " + getHeight();
	}
}
