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
		GeometricObject Circle     = new Circle(5.0);
		GeometricObject Circle2    = new Circle(10.0);		
		GeometricObject Rectangle  = new Rectangle(3.0,6.0);
		GeometricObject Rectangle2 = new Rectangle(5.0,6.0);
		GeometricObject Triangle   = new Triangle(3.0,4.0,5.0);
		GeometricObject Triangle2  = new Triangle(5.0,4.0,5.0);
		
		//Set the colors
		Circle.setColor ("Blue");
		Circle2.setColor("Red" );
		
		Rectangle.setColor ("Purple");
		Rectangle2.setColor("Green" );
		
		Triangle.setColor ("Red" );		
		Triangle2.setColor("Cyan");
		
		//State whether filled or not
		Circle.setFilled (false);
		Circle2.setFilled(true );
		
		Rectangle.setFilled (true );
		Rectangle2.setFilled(false);
		
		Triangle.setFilled (true );		
		Triangle2.setFilled(false);
		
		//Add them to an arraylist
		myShapes.add(Circle);
		myShapes.add(Circle2);
		
		myShapes.add(Rectangle);
		myShapes.add(Rectangle2);
		
		myShapes.add(Triangle);		
		myShapes.add(Triangle2);
		
		//Print the stats for each
		for(GeometricObject shapes:myShapes)
		{
			System.out.println(shapes.toString()+ "\n");			
		}
		
		//Comparisons for each
		System.out.print("Comapring the original circle with the second circle\n\t");
		Circle.compareTo(Circle2);
		System.out.print("\nComapring the second circle with the original circle\n\t");
		Circle2.compareTo(Circle);
		
		System.out.print("\nComparing original rectangle with second rectangle\n\t");
		Rectangle.compareTo(Rectangle2);
		System.out.print("\nComparing second rectangle with original rectangle\n\t");
		Rectangle2.compareTo(Rectangle);
		
		System.out.print("\nComparing the original triangle with the second one\n\t");
		Triangle.compareTo(Triangle2);
		System.out.print("\nComparing the second triangle with the original one\n\t");
		Triangle2.compareTo(Triangle);

		
		//Are the two triangles equal?
		System.out.print("\nDetermining if the two triangles are equal...\n\t");
		Triangle.equals(Triangle2);
	}
}
