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
			ArrayList<AdvancedIceCreamCone> cones = null;

			cones = new ArrayList<AdvancedIceCreamCone>();

			for(AdvancedIceCreamCone ice:cones)
			{
				System.out.println(ice.toString()+"\n\n");
			}

			//System.out.println(read.readObject());

		}
		catch(FileNotFoundException e)
		{
		}
		catch(IOException e)
		{
		}





	}
}