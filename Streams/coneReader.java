/*
 * Name: Russell Tan
 * Date: November 19, 2014
 * Purpose: Display a chosen object that is read from a stream
 * Inputs: IceCreamCones.ser and the flavor of the desired ice cream
 * Outputs: The toString() of the ice cream cone chosen
 */
import java.io.*;
import java.util.*;
public class coneReader
{
	public static void main(String args[])
	{
		//Initialize default values in a global scope
		FileInputStream file = null;
		ObjectInputStream read = null;
		Scanner userInput = new Scanner(System.in);
		String choice = null;
		int k = 0;
		//Using a try-catch to catch the checked exceptions
		try
		{
			//Declare the objectinputstream and apply it to the .ser file that has the stream
			file = new FileInputStream("IceCreamCones.ser");
			read = new ObjectInputStream(file);

			//Prompt user for the desired flavor
			System.out.println("Which flavor ice cream would you like?");
			System.out.print("\n\tVanilla\n\tChocolate\n\tStrawberry\n");
			choice = userInput.nextLine();

			AdvancedIceCreamCone van = (AdvancedIceCreamCone)read.readObject();
			AdvancedIceCreamCone choc = (AdvancedIceCreamCone) read.readObject();
			AdvancedIceCreamCone straw = (AdvancedIceCreamCone)read.readObject();

			//Checking which flavor the user wants
			switch(choice.toLowerCase())
			{
				case "vanilla":
				System.out.println("\t\tYou chose " + choice +"!");
				System.out.println("\n\n" + van.toString() + "\n\n");
				break;
				case "chocolate":
				System.out.println("\t\tYou chose " + choice +"!");
				System.out.println("\n\n" + choc.toString() + "\n\n");
				break;
				case "strawberry":
				System.out.println("\t\tYou chose " + choice +"!");
				System.out.println("\n\n" + straw.toString() + "\n\n");
				break;
				default:
				break;
			}
		}
		//Catching all checked exceptions
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
	}
}