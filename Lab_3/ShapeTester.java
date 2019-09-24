import java.util.ArrayList;

public class ShapeTester {
	public static void main (String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>(10);
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(6);
		Circle c3 = new Circle(9);
		Triangle t1 = new Triangle(3, 4, 5);
		Rectangle r1 = new Rectangle(10, 5);
		Square s1 = new Square(6);

		shapes.add(c1);
		shapes.add(c2);
		shapes.add(c3);
		shapes.add(t1);
		shapes.add(r1);
		shapes.add(s1);
		
		for(Shape shape: shapes) {
			System.out.println(shape.getShape());
		}

		System.out.println("Circle indices in ArrayList shapes:");
		for(int i=0; i< shapes.size(); i++) {
			if(shapes.get(i).getShape() == "Circle") {
				System.out.println(i);	
			}
		}
		System.out.println("Shape Count: " + Shape.getShapeCount());
	}
}
