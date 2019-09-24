public class Square extends Rectangle {
	private double length;

	//Constructor
	public Square(double length) {
		super(length, length);
	}

	//Abstract methods
	@Override
	public String getShape() {
		return "Square";
	}
	@Override
	public double area() {
		return this.length * this.length;
	}
	@Override
	public double perimeter() {
		return 4 * this.length;
	}
	@Override
	public void display() {
		System.out.println("Shape: " + getShape());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
