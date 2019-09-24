public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	//Constructor
	public Triangle (double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	//Abstract Methods
	@Override
	public double area() {
		double p = perimeter() / 2;
		return Math.sqrt((p * (p - this.side1) * (p - this.side2) * (p - this.side3)));
	}
	@Override
	public double perimeter() {
		return side1 + side2 + side3;
	}
	@Override
	public String getShape() {
		return "Triangle"; 
	}
	@Override
	public void display() {
		System.out.println("Shape: " + getShape());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
