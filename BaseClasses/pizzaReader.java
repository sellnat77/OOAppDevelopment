import java.io.*;
import java.util.*;

public class pizzaReader
{
	public static void main(String args[])
	{
		FileInputStream file = null;
		ObjectInputStream read = null;
		ArrayList<pizza> order = new ArrayList<pizza>();

		try
		{
			//Declare the objectinputstream and apply it to the .ser file that has the stream
			file = new FileInputStream("pizzas.ser");
			read = new ObjectInputStream(file);



			pizza plain = (pizza)read.readObject();
			pizza pep = (pizza) read.readObject();
			pizza cheese = (pizza)read.readObject();
			pizza jalep = (pizza)read.readObject();
			pizza olive = (pizza)read.readObject();
			order.add(plain);
			order.add(pep);
			order.add(cheese);
			order.add(jalep);
			order.add(olive);

			for(int k = 0;k < order.size(); k++)
			{
				if(order.get(k).getSize() == 'L')
				{
					System.out.println(order.get(k).toString());
				}
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