public class Rectangle extends Shape {
	private double length;
	private double width;

	//Constructor
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	//Abstract methods
	@Override
	public String getShape() {
		return "Rectangle";
	}
	@Override
	public double area() {
		return this.length * this.width;
	}
	@Override
	public double perimeter() {
		return (2 * this.length) + (2 * this.width);
	}
}
