/**
 * Shape class with area, perimeter, and getShape methods
 */

public abstract class Shape {
	private String name;
	private static int shapeCount;

	//Abstract Methods	
	abstract double area();
	abstract double perimeter();
	abstract String getShape();

	//Constructor
	public Shape(String name) {
		this.name = name;
	}
}
