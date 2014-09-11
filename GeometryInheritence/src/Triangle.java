
public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}
	public Triangle(double A)
	{
		side1 = A;
	}
	public Triangle(double A, double B)
	{
		side1 = A;
		side2 = B;
	}
	public Triangle(double A, double B, double C)
	{
		side1 = A;
		side2 = B;
		side3 = C;
	}
	
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
	
	public double getPerimeter()
	{
		return Math.round((this.getSide1()+this.getSide2()+this.getSide3())*100.0)/100.0;
	}
	
	public double getArea()
	{
		double scratch,halfPerim;
		
		halfPerim = this.getPerimeter()/2;
		
		scratch = (halfPerim*(halfPerim-this.getSide1())*(halfPerim-this.getSide2())*(halfPerim-this.getSide3()));
		
		return Math.round(Math.sqrt(scratch)*100.0)/100.0;		
	}
	
	public int getMax()
	{
		return (int)this.getArea();
	}
	
	public String toString()
	{
		return "This triangle was created on "+super.getDateCreated()+"\n\tColor: "+super.getColor()+"\n\tFilled: "+super.getFilled()
				+"\n\tFirst Side: "+this.getSide1()+"\n\tSecond Side: "+this.getSide2()+"\n\tThird Side: "+this.getSide3()
				+"\n\tPerimeter: "+this.getPerimeter()+"\n\tArea: "+this.getArea();
	}
	
	@Override
	public int compareTo(Object shape) 
	{
		Triangle myShape =(Triangle) shape;
		
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
