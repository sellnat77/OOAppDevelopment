
public class Circle extends GeometricObject
{
	private double radius;
	
	public Circle()
	{
		radius = 1.0;
	}
	public Circle(double A)
	{
		this.radius = A;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public int getMax()
	{
		return (int)this.getArea();
	}
	
	public void setRadius(double A)
	{
		this.radius = A;
	}
	
	public double getDiameter()
	{
		return Math.round(this.getRadius()*2*100.0)/100.0;
	}
	
	public double getPerimeter()
	{
		return Math.round(2*Math.PI*this.getRadius()*100.0)/100.0;
	}
	
	public double getArea()
	{
		return Math.round(Math.PI*this.getRadius()*this.getRadius()*100.0)/100.0;
	}
	
	public int max()
	{
		return (int)this.getArea();
	}
	
	public String toString()
	{
		return "This circle was created on "+super.getDateCreated()+"\n\tColor: "+super.getColor()+"\n\tFilled: "+super.getFilled()
				+"\n\tRadius: "+this.getRadius()+"\n\tPerimeter: "+this.getPerimeter()+"\n\tArea: "+this.getArea();
	}
	
	@Override
	public int compareTo(Object shape) 
	{
		Circle myShape =(Circle) shape;
		
		if(this.max() > myShape.max())
		{
			System.out.println("The original shape is larger.");
			return 1;
		}		
		else if(this.max() < myShape.max())
		{
			System.out.println("The second shape is larger.");
			return -1;
		}		
		return 0;
	}	
}
