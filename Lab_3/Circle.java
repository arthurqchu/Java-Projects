/**
 * Circle entends Shape
 * Should override the abstract methods from Shape
 */
public class Circle extends Shape {
	private double diameter;

	//Constructor
	public Circle(double diameter) {
		super();
		this.diameter = diameter;
	}

	//Override methods
	@Override
	public String getShape() {
		return "Circle";
	}
	@Override	
	public double area() {
		return (2 * (this.diameter/2) ) * Math.PI;
	}
	@Override
	public double perimeter() {
		return this.diameter * Math.PI;
		
	}
	@Override
	public void display() {
		System.out.println("Shape: " + getShape());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
