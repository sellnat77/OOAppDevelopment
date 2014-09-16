/*
 * Name   : Russell Tan
 * Date   : September 15, 2014
 * Purpose: Create a circle object
 * Inputs : na
 * Output : A circle object
 */

public class Circle extends GeometricObject
{
	private double radius;

	/**
	 * Default constructor
	 */
	public Circle()
	{
		radius = 1.0;
	}
	
	/**
	 * Full constructor
	 * @param A specifies the radius
	 */
	public Circle(double A)
	{
		this.radius = A;
	}
	
	/**
	 * Accessor
	 * @return radius of the circle
	 */
	public double getRadius()
	{
		return this.radius;
	}
	
	/**
	 * Mutator
	 * @param A specifies the radius
	 */
	public void setRadius(double A)
	{
		this.radius = A;
	}
	
	/**
	 * Used for comparisons
	 * @return area of the circle
	 */
	public int getMax()
	{
		return (int)this.getArea();
	}
	
	/**
	 * Diameter calculator
	 * @return diameter of the circle
	 */
	public double getDiameter()
	{
		return Math.round(this.getRadius()*2*100.0)/100.0;
	}
	
	/**
	 * Perimeter calculator
	 * @return perimeter of the circle
	 */
	public double getPerimeter()
	{
		return Math.round(2*Math.PI*this.getRadius()*100.0)/100.0;
	}
	
	/**
	 * Area calculator
	 * @return Area of the circle
	 */
	public double getArea()
	{
		return Math.round(Math.PI*this.getRadius()*this.getRadius()*100.0)/100.0;
	}
	
	/**
	 * Used for comparisons
	 * @return Area of the circle
	 */
	public int max()
	{
		return (int)this.getArea();
	}
	
	/**
	 * Displays the circle object in a formatted string
	 */
	public String toString()
	{
		return "This circle was created on "+super.getDateCreated()+"\n\tColor: "+super.getColor()+"\n\tFilled: "+super.getFilled()
				+"\n\tRadius: "+this.getRadius()+"\n\tPerimeter: "+this.getPerimeter()+"\n\tArea: "+this.getArea();
	}
	
	/**
	 * Compares two circle objects
	 */
	@Override
	public int compareTo(Object shape) 
	{
		Circle myShape =(Circle) shape;
		
		if(this.max() > myShape.max())
		{
			System.out.println("The original circle is larger.");
			return 1;
		}		
		else if(this.max() < myShape.max())
		{
			System.out.println("The second circle is larger.");
			return -1;
		}		
		return 0;
	}	
}
