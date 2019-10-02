/**
 *Square extends Rectangle
 * @author Arthur
 *
 */
public class Square extends Rectangle {	
	/**
	 * Square Constructor
	 * @param length
	 */
	public Square(double width) {
		super(width, width);
	}
	
	//Methods
	/**
	 * Overrides the equals method to return true if two squares are the same size
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Square) {
			Square s = (Square) obj;
			if (s.getLength() == getLength()) {
				return true;
			}
			else {
				return false;
			}
		
		}
		else {
			return false;
		}
	}
	/**
	 * Overrides toString from Rectangle superclass
	 */
	@Override
	public String toString() {
		return "Shape: Square" + "\nLength: " + getLength() + "\nHeight: " + getHeight();
	}
}
