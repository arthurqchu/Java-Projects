/**
 * Shape class with area, perimeter, and getShape methods
 */

public abstract class Shape implements Displayable, Comparable<Shape> {
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
	/**
	*Returns shapeCount
	*/
	public static int getShapeCount() {
		return shapeCount;
	}
	@Override
	public void display() {
	}
	/**
	*Overrides compareTo method from the Comparable
	*superclass in order to compare the shapes by the areas
	*/
	@Override
	public int compareTo(Shape otherShape) {
		if(this.area() > otherShape.area()) {
			return 1;
		}
		if(this.area() < otherShape.area()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
