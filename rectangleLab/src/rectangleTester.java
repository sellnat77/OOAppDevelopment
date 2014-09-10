public class rectangleTester 
{
	public static void main(String[] args) 
	{
		BetterRectangle myRect = new BetterRectangle(3,4);
		
		System.out.println("The height is   : " + myRect.getHeight() + " units");
		System.out.println("The width is    : " + myRect.getWidth() + " units\n");
		
		System.out.println("The perimeter is: " +myRect.getPerimeter() + "  units");
		System.out.println("The area is     : " + myRect.getArea() + "  units");	

	}

}
