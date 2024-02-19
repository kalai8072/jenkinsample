package javaAbstract;

abstract class CircleShape{
	
	public abstract void areaCalculation(double ra);
}

class concreteCircle extends CircleShape{

	@Override
	public void areaCalculation(double ra) {
		// TODO Auto-generated method stub
		double areaCircle = 3.14 * ra * ra;
		System.out.println("Area of the circle: " + areaCircle + " squnits");
	}
	
}

abstract class RectangleShape{
	
	public abstract void areaCalculation(double l, double b);
}

class concreteRectangle extends RectangleShape{

	@Override
	public void areaCalculation(double l, double b) {
		// TODO Auto-generated method stub
		double areaReactangle = l * b;
		System.out.println("Area of the rectangle: "+ areaReactangle +" squnits");
		
	}
	
}

public class AbstractShapesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircleShape obj1 = new concreteCircle();
		obj1.areaCalculation(8.5);
		
		RectangleShape obj2 = new concreteRectangle();
		obj2.areaCalculation(5.5, 2.5);
		
	
		
		
	}

}
