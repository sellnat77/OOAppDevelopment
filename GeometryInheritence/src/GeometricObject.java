public class GeometricObject implements Comparable
{
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String theColor)
	{
		dateCreated = new java.util.Date();
		this.color = theColor;
	}
	public GeometricObject(String theColor, boolean fill)
	{
		dateCreated = new java.util.Date();
		this.color = theColor;
		this.filled = fill;
	}
	
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
	
	public void setColor(String theColor)
	{
		this.color = theColor;
	}
	
	public void setFilled(boolean fill)
	{
		this.filled = fill;
	}
	
	public String toString()
	{
		return "This was created on "+this.getDateCreated()+"\n\tColor: "+this.getColor()+"\n\tFilled: "+this.getFilled();
	}
	@Override
	public int compareTo(Object arg0) 
	{
		// TODO Auto-generated method stub
		return 0;
	}	
	
	
}