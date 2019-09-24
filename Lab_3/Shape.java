/**
 * Shape class with area, perimeter, and getShape methods
 */

public abstract class Shape implements Displayable {
	private static int shapeCount = 0;

	//Abstract Methods	
	abstract double area();
	abstract double perimeter();
	abstract String getShape();

	/**
	 * Super constructor increments shapeCount
	 */
	//Constructor
	public Shape() {
		shapeCount += 1;
	}
	public static int getShapeCount() {
		return shapeCount;
	}
	@Override
	abstract void display();
}
