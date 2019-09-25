/**
 * Circle entends Shape
 * Should override the abstract methods from Shape
 */
public class Circle extends Shape {
	private double diameter;

	//Constructor
	/**
	* Constructor inherits superconstructor from Shape and adds diameter
	*/
	public Circle(double diameter) {
		super();
		this.diameter = diameter;
	}

	//Override methods
	/**
	* Returns string "Circle" for circles
	*/
	@Override
	public String getShape() {
		return "Circle";
	}
	/**
	* Returns area of a circle
	*/
	@Override	
	public double area() {
		return (2 * (this.diameter/2) ) * Math.PI;
	}
	/**
	* Returns a circle's perimeter
	*/
	@Override
	public double perimeter() {
		return this.diameter * Math.PI;
		
	}
	/**
	*Displays pertinent info about circle
	*/
	@Override
	public void display() {
		System.out.println("Shape: " + getShape());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
