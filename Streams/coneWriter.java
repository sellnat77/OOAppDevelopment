/*
 * Name: Russell Tan
 * Date: November 19, 2014
 * Purpose: Write an array list of objest to a stream
 * Inputs: Three advanced ice cream cone objects
 * Outputs: IceCreamCones.ser object stream file
 */
import java.util.*;
import java.io.*;
public class coneWriter
{
	public static void main(String args[])
	{
		//Initialize default values globally
		AdvancedIceCreamCone cone = new AdvancedIceCreamCone();
		FileOutputStream iceCream = null;
		ObjectOutputStream write = null;
		//Using a try to catch checked exceptions
		try
		{
			//Applying the object output stream to the icecreamcones.ser file
			iceCream = new FileOutputStream("IceCreamCones.ser");
			write = new ObjectOutputStream(iceCream);
			//Instantiate the three objects to add to the array list
			AdvancedIceCreamCone vanillaCone = new AdvancedIceCreamCone();
			AdvancedIceCreamCone chocoCone = new AdvancedIceCreamCone();
			AdvancedIceCreamCone strawCone = new AdvancedIceCreamCone();
			//Create the array list of type AdvancedIceCreamCone


			//Modifying the member variables of each object
			vanillaCone.addScoop();
			vanillaCone.addScoop();
			vanillaCone.setTypeOfCone("Waffle");
			vanillaCone.addToppings("Butterfinger");
			vanillaCone.addToppings("Marshmallow");

			chocoCone.addScoop();
			chocoCone.addScoop();
			chocoCone.addScoop();
			chocoCone.setFlavor("Chocolate");
			chocoCone.setTypeOfCone("Chocolate Dipped");
			chocoCone.addToppings("Reeses");
			chocoCone.addToppings("Hot Fudge");

			strawCone.addScoop();
			strawCone.setFlavor("Strawberry");
			strawCone.addToppings("Strawberry Syrup");
			strawCone.addToppings("Strawberries");
			strawCone.addToppings("Gummy Bears");

			//Write the object stream as individual objects to the .ser file
			write.writeObject(vanillaCone);
			write.writeObject(chocoCone);
			write.writeObject(strawCone);
			//Close the stream
			write.close();
		}
		//Catching checked exceptions
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}
	}
}