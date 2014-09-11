public class Rectangle extends GeometricObject
{
	private double width;
	private double height;
	
	public Rectangle(){}
	public Rectangle(double A)
	{
		width = A;
	}
	public Rectangle(double A, double B)
	{
		width = A;
		height = B;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	public void setWidth(double A)
	{
		this.width = A;
	}
	public void setHeight(double A)
	{
		this.height = A;
	}
	
	public double getPerimeter()
	{
		return Math.round(((2*this.getHeight())+(2*this.getWidth()))*100.0)/100.0;
	}
	
	public double getArea()
	{
		return Math.round(this.getHeight()*this.getWidth()*100.0)/100.0;
	}
	
	public int getMax()
	{
		return (int)this.getArea();
	}
	
	public String toString()
	{
		return "This rectangle was created on "+super.getDateCreated()+"\n\tColor: "+super.getColor()+"\n\tFilled: "+super.getFilled()
				+"\n\tWidth: "+this.getWidth()+"\n\tHeght: "+this.getHeight()+"\n\tPerimeter: "+this.getPerimeter()
				+"\n\tArea: "+this.getArea();
	}
	
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
