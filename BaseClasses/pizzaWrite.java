import java.util.*;
import java.io.*;

public class pizzaWrite
{
	public static void main(String args[])
	{
		pizza piz = new pizza();

		FileOutputStream call = null;
		ObjectOutputStream order = null;

		try
		{
			call = new FileOutputStream("pizzas.ser");
			order = new ObjectOutputStream(call);

			pizza plain = new pizza();
			pizza pep = new pizza('M',"Garlic Parmesean", "New York");
			pizza cheese = new pizza('S',"Marinara","Thin");
			pizza jalep = new pizza('L',"Buffalo","Cajun");
			pizza olive = new pizza('L',"Alfredo","Deep Dish");

			pep.addToppings("Pepperoni");
			cheese.addToppings("Extra Cheese");
			jalep.addToppings("Jalepeno");
			olive.addToppings("Olives");

			order.writeObject(plain);
			order.writeObject(pep);
			order.writeObject(cheese);
			order.writeObject(jalep);
			order.writeObject(olive);

			order.close();
		}
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