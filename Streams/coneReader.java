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
			file = new FileInputStream("IceCreamCones.ser");
			read = new ObjectInputStream(file);
			ArrayList<AdvancedIceCreamCone> cones = (ArrayList<AdvancedIceCreamCone>)read.readObject();

			for(AdvancedIceCreamCone ice : cones)
			{
				System.out.println(ice.toString()+"\n\n");
			}

			//System.out.println(read.readObject());

		}
		catch(FileNotFoundException e)
		{
		}
		catch(ClassNotFoundException e)
		{
		}
		catch(IOException e)
		{
		}





	}
}