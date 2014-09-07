import java.util.ArrayList;

public class GeometryTester
{
	public static void main(String[] args) 
	{
		ArrayList<GeometricObject> myShapes = new ArrayList<GeometricObject>();
		
		GeometricObject Circle = new Circle(5.0);
		GeometricObject Rectangle= new Rectangle(3.0,6.0);
		GeometricObject Triangle= new Triangle(3.0,4.0,5.0);
		
		Circle.setColor("Blue");
		Rectangle.setColor("Purple");
		Triangle.setColor("Red");
		
		Circle.setFilled(false);
		Rectangle.setFilled(true);
		Triangle.setFilled(true);
		
		myShapes.add(Circle);
		myShapes.add(Rectangle);
		myShapes.add(Triangle);
		
		for(GeometricObject shapes:myShapes)
		{
			System.out.println(shapes.toString()+ "\n");
		}
	}
}
