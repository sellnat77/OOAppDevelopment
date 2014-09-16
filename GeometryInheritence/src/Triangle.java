/*
 * Name   : Russell Tan
 * Date   : September 15, 2014
 * Purpose: Create a triangle object
 * Inputs : na
 * Output : Triangle object with stats
 */
public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	/**
	 * Default constructor
	 */
	public Triangle()
	{
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}
	
	/**
	 * Partial constructors
	 * @param A Definition of side1
	 * @param B Definition of side2
	 */
	public Triangle(double A)
	{
		side1 = A;
	}
	
	public Triangle(double A, double B)
	{
		side1 = A;
		side2 = B;
	}
	
	/**
	 * Full Constructor
	 * @param A Definition of side1
	 * @param B Definition of side2
	 * @param C Definition of side3
	 */
	public Triangle(double A, double B, double C)
	{
		side1 = A;
		side2 = B;
		side3 = C;
	}
	
	/**
	 * Accessors
	 * @return side1
	 * @return side2
	 * @return side3
	 */
	public double getSide1()
	{
		return this.side1;
	}
	public double getSide2()
	{
		return this.side2;
	}
	public double getSide3()
	{
		return this.side3;
	}
	
	/**
	 * Mutators
	 * @param A Sets side1, side2, side3
	 */
	public void setSide1(double A)
	{
		this.side1 = A;
	}
	public void setSide2(double A)
	{
		this.side2 = A;
	}
	public void setSide3(double A)
	{
		this.side3 = A;
	}
	
	/**
	 * Perimeter calculation
	 * @return perimeter of the triangle
	 */
	public double getPerimeter()
	{
		return Math.round((this.getSide1()+this.getSide2()+this.getSide3())*100.0)/100.0;
	}
	
	/**
	 * Area calculation
	 * @return Area of triangle based on herons formula
	 */
	public double getArea()
	{
		double scratch,halfPerim;
		
		halfPerim = this.getPerimeter()/2;
		
		scratch = (halfPerim*(halfPerim-this.getSide1())*(halfPerim-this.getSide2())*(halfPerim-this.getSide3()));
		
		return Math.round(Math.sqrt(scratch)*100.0)/100.0;		
	}
	
	/**
	 * Used for comparisons
	 * @return Area of triangle
	 */
	public int getMax()
	{
		return (int)this.getArea();
	}
	
	/**
	 * Displays the facts about this triangle object in one formatted string
	 */
	public String toString()
	{
		return "This triangle was created on "+super.getDateCreated()+"\n\tColor: "+super.getColor()+"\n\tFilled: "+super.getFilled()
				+"\n\tFirst Side: "+this.getSide1()+"\n\tSecond Side: "+this.getSide2()+"\n\tThird Side: "+this.getSide3()
				+"\n\tPerimeter: "+this.getPerimeter()+"\n\tArea: "+this.getArea();
	}
	
	/**
	 * Compares other triangles
	 */
	@Override
	public int compareTo(Object shape) 
	{
		Triangle myShape =(Triangle) shape;
		
		if(this.getMax() > myShape.getMax())
		{
			System.out.println("The original triangle is larger.");
			return 1;
		}		
		else if(this.getMax() < myShape.getMax())
		{
			System.out.println("The second triangle is larger.");
			return -1;
		}		
		return 0;
	}
	
	/**
	 * Determines if one triangle is equal to another based on area
	 */
	public boolean equals(Object shape)
	{
		Triangle myShape =(Triangle) shape;
		
		if(this.getMax() == myShape.getMax())
		{
			System.out.println("Your shapes are equal");
			return true;
		}
		else
		{
			System.out.println("Your triangles are not equal.");
			return false;
		}
	}
}
