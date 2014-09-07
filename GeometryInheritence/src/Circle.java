
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
	
	public String toString()
	{
		return "This circle was created on "+super.getDateCreated()+"\n\tColor: "+super.getColor()+"\n\tFilled: "+super.getFilled()
				+"\n\tRadius: "+this.getRadius()+"\n\tPerimeter: "+this.getPerimeter()+"\n\tArea: "+this.getArea();
	}
}
