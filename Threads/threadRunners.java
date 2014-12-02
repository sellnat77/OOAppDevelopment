/*
 * Name: Russell Tan
 * Date: 1 December 2014
 * Purpose: Create threads that will simulate a race and provide place finished
 * Inputs: The name of the animal, speed, amd rest factor
 * Outputs: Animals check in every fourth iteration and notify when they finish the race
 */
import java.util.*;
public class threadRunners implements Runnable
{
	//Private members for the race
	private int speed;
	private String name;
	private int rest;
	//Static and final variables to handle track size and establish place finished
	private static int place = 1;
	private final int totalDistance = 1200;

	//Default constructor
	threadRunners(){}

	//Full Constructor
	threadRunners(int A, int B, String C)
	{
		speed = A;
		rest = B;
		name = C;
	}

	//Accessors
	public int getSpeed()
	{
		return speed;
	}
	public String getName()
	{
		return name;
	}
	public int getRest()
	{
		return rest;
	}

	//Mutators
	public void setSpeed(int A)
	{
		speed = A;
	}
	public void setName(String A)
	{
		name = A;
	}
	public void setRest(int A)
	{
		rest = A;
	}

	//Run method used for threads
	public void run()
	{
		//Instantiate the total distance covered and count to zero to track progress
		int totalDistanceCovered = 0;
		int count = 0;
		//Using try to catch checked exceptions
		try
		{
			while(totalDistanceCovered < totalDistance)
			{
				//Animals check in every fourth iteration
				if(count % 4 == 0 && totalDistanceCovered != 0)
				{
					System.out.println(this.getName()+" has run \t" + totalDistanceCovered + "m!\n");
				}
				totalDistanceCovered += this.getSpeed();
				Thread.sleep(this.getRest());
				count++;
			}
			//Using switch to account for first, second, and third cases
			switch(place)
			{
				case 1:
				System.out.println("\t\t\t" + this.getName() + " has finished in " + place + "st place!");
				break;
				case 2:
				System.out.println("\t\t\t" + this.getName() + " has finished in " + place + "nd place!");
				break;
				case 3:
				System.out.println("\t\t\t" + this.getName() + " has finished in " + place + "rd place!");
				break;
				default:
				System.out.println("\t\t\t" + this.getName() + " has finished in " + place + "th place!");
				break;
			}
			//Increment the static place to keep track of who finished when
			place++;
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	//Ask user about the particular animal
	public void prompt()
	{
		Scanner userInput = new Scanner(System.in);
		//Asks for the name, speed, and rest factor of each animal
		try
		{
			System.out.print("What is the name of the animal? ");
			this.setName(userInput.nextLine());
			System.out.print("What is the speed? ");
			this.setSpeed(userInput.nextInt());
			System.out.print("How long does it need to rest? ");
			this.setRest(userInput.nextInt());
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
	}
}