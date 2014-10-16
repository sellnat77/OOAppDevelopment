/*
 * Name   : Russell Tan
 * Date   : October 11, 2014
 * Purpose: Test the measurable generic class given a variety of arraylists
 * Inputs : int, string, double, character arraylists
 * Output : The entire array list and the largest value of each
 */
import java.util.*;

public class genericTest
{
	public static void main(String theory[])
	{
		//Used for modified for loop
		int k = 0;
		//Instantiate the array list of person objects
		ArrayList<Person> people = new ArrayList<Person>();
		//Instantiate my person object to use the static max method with
		Person test = new Person();

		//Instantiate all of the people to add to the array list
		Person test1 = new Person(13,"Stan");
		Person test2 = new Person(12,"Russell");
		Person test3 = new Person(74,"Jack");
		Person test4 = new Person(82,"Bailey");
		Person test5 = new Person(3,"Lisa");
		Person test6 = new Person(25,"Mark");
		Person test7 = new Person(98,"Julia");
		Person test8 = new Person(56,"Francis");

		//Add the people to the array list
		people.add(test1);
		people.add(test2);
		people.add(test3);
		people.add(test4);
		people.add(test5);
		people.add(test6);
		people.add(test7);
		people.add(test8);

		//Prints the necessary output to demonstrate the correct usage of extending measurable class
		System.out.println("The people added to the array list are as follows:\n");

		for ( Person element : people )
		{
			System.out.printf( "\t\tName: %7s \tAge: %2d \n", element.getName(), element.getAge());
			k++;
	   	}
	   	System.out.print("\n\nThe oldest person within the arraylist is ");
		System.out.print(test.max(people).getName());
		System.out.printf(" who is %2d years old.\n\n\n",test.max(people).getAge());
	}
}