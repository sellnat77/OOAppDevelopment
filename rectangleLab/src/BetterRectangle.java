import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
	
	BetterRectangle(int width,int height)
	{
		super(width,height);		
	}
	
	public int getPerimeter()
	{		
		return (int)(2*super.getHeight()+2*super.getWidth());
	}
	
	public int getArea()
	{
		return (int)(super.getHeight()*super.getWidth());		
	}
}
