/*
 * Name   : Russell Tan
 * Date   : September 15, 2014
 * Purpose: Create a rectangle object
 * Inputs : na
 * Output : Rectangle object
 */
public class Rectangle extends GeometricObject
{
	private double width;
	private double height;
	
	/**
	 * Default constructor
	 */
	public Rectangle(){}
	
	/**
	 * Partial constructor
	 * @param A specifies the width
	 */
	public Rectangle(double A)
	{
		width = A;
	}
	
	/**
	 * Full constructor
	 * @param A Specifies the width
	 * @param B Specifies the height
	 */
	public Rectangle(double A, double B)
	{
		width = A;
		height = B;
	}
	
	/**
	 * Accessors
	 * @return width
	 * @return height
	 */
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	/**
	 * Mutators
	 * @param A specifies width and height
	 */
	public void setWidth(double A)
	{
		this.width = A;
	}
	public void setHeight(double A)
	{
		this.height = A;
	}
	
	/**
	 * Perimeter calculator
	 * @return perimeter of the rectangle
	 */
	public double getPerimeter()
	{
		return Math.round(((2*this.getHeight())+(2*this.getWidth()))*100.0)/100.0;
	}
	
	/**
	 * Area calculator
	 * @return Area of the rectangle
	 */
	public double getArea()
	{
		return Math.round(this.getHeight()*this.getWidth()*100.0)/100.0;
	}
	
	/**
	 * Used for comparisons
	 * @return area of rectangle
	 */
	public int getMax()
	{
		return (int)this.getArea();
	}
	
	/**
	 * Displays the facts about this rectangle object in one formatted string
	 */
	public String toString()
	{
		return "This rectangle was created on "+super.getDateCreated()+"\n\tColor: "+super.getColor()+"\n\tFilled: "+super.getFilled()
				+"\n\tWidth: "+this.getWidth()+"\n\tHeght: "+this.getHeight()+"\n\tPerimeter: "+this.getPerimeter()
				+"\n\tArea: "+this.getArea();
	}
	
	/**
	 * Compares other rectangles
	 */
	@Override
	public int compareTo(Object shape) 
	{
		Rectangle myShape =(Rectangle) shape;
		
		if(this.getMax() > myShape.getMax())
		{
			System.out.println("The original shape is larger.");
			return 1;
		}		
		else if(this.getMax() < myShape.getMax())
		{
			System.out.println("The second shape is larger.");
			return -1;
		}		
		return 0;
	}
}
