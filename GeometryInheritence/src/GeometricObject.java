/*
 * Name   : Russell Tan
 * Date   : September 15,2014 
 * Purpose: Create a parent class for all of the different shapes
 * Inputs : Na
 * Output : a plain geometric object with a date
 */
public class GeometricObject implements Comparable
{
	private String color = "White";
	private boolean filled;
	private static int max;
	private java.util.Date dateCreated;
	
	/**
	 * Default constructor
	 */
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	
	/**
	 * Partial constructor
	 * @param theColor specifies the color of the shape
	 */
	public GeometricObject(String theColor)
	{
		dateCreated = new java.util.Date();
		this.color = theColor;
	}
	
	/**
	 * Full constructor
	 * @param theColor specifies the color of the shape
	 * @param fill specifies whether or not the shape is filled
	 */
	public GeometricObject(String theColor, boolean fill)
	{
		dateCreated = new java.util.Date();
		this.color = theColor;
		this.filled = fill;
	}
	
	/**
	 * Accessors
	 * @return Color
	 * @return Filled
	 * @return Date created
	 * @return max
	 */
	public String getColor()
	{
		return this.color;
	}
	public boolean getFilled()
	{
		return this.filled;
	}
	public java.util.Date getDateCreated()
	{
		return this.dateCreated;
	}
	public int getMax()
	{
		return max;
	}
	
	/**
	 * Mutators
	 * @param theColor specifies the color
	 * @param fill specifies whether or not the shape is filled
	 * @param theMax specifies the max of the shape
	 */
	public void setColor(String theColor)
	{
		this.color = theColor;
	}
	
	public void setFilled(boolean fill)
	{
		this.filled = fill;
	}
	
	public void setMax(int theMax)
	{
		this.max = theMax;
	}
	
	/**
	 * Displays the basic geometric object in a formatted string
	 */
	public String toString()
	{
		return "This was created on "+this.getDateCreated()+"\n\tColor: "+this.getColor()+"\n\tFilled: "+this.getFilled();
	}
	
	/**
	 * Used to compares two geometric shapes
	 */
	@Override
	public int compareTo(Object shape) 
	{
		GeometricObject myShape =(GeometricObject) shape;
		
		if(this.getMax() > myShape.getMax())
		{
			return 1;
		}		
		else if(this.getMax() < myShape.getMax())
		{
			return -1;
		}		
		return 0;
	}		
}