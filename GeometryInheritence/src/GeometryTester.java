/*
 * Name   : Russell Tan
 * Date   : September 15, 2014
 * Purpose: Display implementation of inheritance in different shape objects
 * Inputs : na
 * Outputs: Different stats about shape objects
 */

import java.util.ArrayList;
public class GeometryTester
{
	public static void main(String[] args) 
	{
		ArrayList<GeometricObject> myShapes = new ArrayList<GeometricObject>();
		
		//Instantiate 2 of each shape with different sizes
		GeometricObject Circle = new Circle(5.0);
		GeometricObject Circle2 = new Circle(10.0);		
		GeometricObject Rectangle= new Rectangle(3.0,6.0);
		GeometricObject Rectangle2= new Rectangle(5.0,6.0);
		GeometricObject Triangle= new Triangle(3.0,4.0,5.0);
		GeometricObject Triangle2= new Triangle(5.0,4.0,5.0);
		
		//Set the colors
		Circle.setColor("Blue");
		Rectangle.setColor("Purple");
		Triangle.setColor("Red");
		Circle2.setColor("Blue");
		Rectangle2.setColor("Purple");
		Triangle2.setColor("Red");
		
		//State whether filled or not
		Circle.setFilled(false);
		Rectangle.setFilled(true);
		Triangle.setFilled(true);
		Circle2.setFilled(false);
		Rectangle2.setFilled(true);
		Triangle2.setFilled(true);
		
		//Add them to an arraylist
		myShapes.add(Circle);
		myShapes.add(Rectangle);
		myShapes.add(Triangle);
		myShapes.add(Circle2);
		myShapes.add(Rectangle2);
		myShapes.add(Triangle2);
		
		//Print the stats for each
		for(GeometricObject shapes:myShapes)
		{
			System.out.println(shapes.toString()+ "\n");			
		}
		
		//Comparisons for each
		Rectangle.compareTo(Rectangle2);
		Rectangle2.compareTo(Rectangle);
		Triangle.compareTo(Triangle2);
		Triangle2.compareTo(Triangle);
		Circle.compareTo(Circle2);
		Circle2.compareTo(Circle);
		
		//Are the two triangles equal?
		Triangle.equals(Triangle2);
	}
}
