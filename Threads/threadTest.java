/*
 * Name: Russell Tan
 * Date: 1 December 2014
 * Purpose: Simulate animals racing around a track
 * Inputs: Number of animals, their names, speeds, and rest factors
 * Outputs: The distance covered by each animal every fourth iteration
 *			and the place in which they finished
 */
import java.util.*;
public class threadTest
{
	public static void main(String args[])
	{
		//Scanner for number of animals
		Scanner userInput = new Scanner (System.in);
		int k;
		int num = 0;

		//Asks user to determine how many thread runner objects to instantiate
		System.out.println("How many animals are in the race?");
		num = userInput.nextInt();

		//Instantiate the appropriate number of objects and threads using an array
		threadRunners[] animals = new threadRunners[num];
		Thread[] t = new Thread[num];

		//Create the threads for the objects
		for(k = 0; k < num; k++)
		{
			animals[k] = new threadRunners();
			animals[k].prompt();
			t[k] = new Thread(animals[k]);
		}
		//Starts the threads
		for(k = 0; k < num; k++)
		{
			t[k].start();
		}
	}
}