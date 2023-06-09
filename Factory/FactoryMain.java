package factoryMethod;

public class FactoryMain {
	
	public static void main (String [] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 = ShapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = ShapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = ShapeFactory.getShape("square");
		shape3.draw();
		
	}

}
