/**
* Class extends Shape and creates and operates on triangles
*/
public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	/**
	* Inherits Shape superconstructor and adds lengths of sides
	*/
	//Constructor
	public Triangle (double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	* Returns area of a triangle
	*/
	//Abstract Methods
	@Override
	public double area() {
		double p = perimeter() / 2;
		return Math.sqrt((p * (p - this.side1) * (p - this.side2) * (p - this.side3)));
	}

	/**
	* Returns perimeter of triangle
	*/
	@Override
	public double perimeter() {
		return side1 + side2 + side3;
	}
	/**
	* Returns "Triangle" for triangles
	*/
	@Override
	public String getShape() {
		return "Triangle"; 
	}
	/**
	* Displays useful information about the triangle
	*/
	@Override
	public void display() {
		System.out.println("Shape: " + getShape());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
