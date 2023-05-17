package factoryMethod;

public class ShapeFactory {
	
	public static Shape getShape (String shapetype) {
		if (shapetype==null) {
			return null;
		}
		if (shapetype.equalsIgnoreCase("Circle")) {   
			return new Circle();
		}
		if (shapetype.equalsIgnoreCase("Rectangle")) {
			return new Rectangle ();
		}
		else if (shapetype.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}

}
