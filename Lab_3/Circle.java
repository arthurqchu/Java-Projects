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
		return (2 * (diameter/2) ) * Math.PI;
	}
	@Override
	public double perimeter() {
		return diameter * Math.PI;
		
	}
}
