import java.util.*;
import java.io.*;


public class coneWriter
{
	public static void main(String args[])
	{
		AdvancedIceCreamCone cone = new AdvancedIceCreamCone();
		FileOutputStream iceCream = null;
		ObjectOutputStream write = null;

		try
		{
			iceCream = new FileOutputStream("IceCreamCones.txt");
			write = new ObjectOutputStream(iceCream);
			AdvancedIceCreamCone vanillaCone = new AdvancedIceCreamCone();



			vanillaCone.addScoop();
			vanillaCone.addScoop();
			vanillaCone.setTypeOfCone("Waffle");
			vanillaCone.addToppings("Butterfinger");
			vanillaCone.addToppings("Marshmallow");
			AdvancedIceCreamCone chocoCone = new AdvancedIceCreamCone();
			chocoCone.addScoop();
			chocoCone.addScoop();
			chocoCone.addScoop();
			chocoCone.setFlavor("Chocolate");
			chocoCone.setTypeOfCone("Chocolate Dipped");
			chocoCone.addToppings("Reeses");
			chocoCone.addToppings("Hot Fudge");
			AdvancedIceCreamCone strawCone = new AdvancedIceCreamCone();
			strawCone.addScoop();
			strawCone.setFlavor("Strawberry");
			strawCone.addToppings("Strawberry Syrup");
			strawCone.addToppings("Strawberries");
			strawCone.addToppings("Gummy Bears");

			write.writeObject(vanillaCone);
			write.writeObject(chocoCone);
			write.writeObject(strawCone);

			write.close();


		}
		catch(FileNotFoundException e)
		{
		}
		catch(Exception e)
		{
		}

	}

}