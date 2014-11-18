import java.io.*;
import java.util.*;


public class coneReader
{
	public static void main(String args[])
	{
		FileInputStream file = null;
		ObjectInputStream read = null;
		try
		{
			file = new FileInputStream("IceCreamCones.txt");
			read = new ObjectInputStream(file);
			AdvancedIceCreamCone cone = (AdvancedIceCreamCone)read.readObject();

			System.out.println(read.readObject().toString());

		}
		catch(FileNotFoundException e)
		{
		}
		catch(IOException e)
		{
		}
		catch(ClassNotFoundException e)
		{
		}





	}
}