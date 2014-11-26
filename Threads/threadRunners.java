import java.util.*;
public class threadRunners implements Runnable
{
	private int speed;
	private String typeOfAnimal;
	private String name;
	private int rest;
	private int totalDistance = 1200;

	threadRunners(){}

	threadRunners(int A, int B, String C, String D)
	{
		speed = A;
		rest = B;
		typeOfAnimal = C;
		name = D;
	}

	public int getSpeed()
	{
		return speed;
	}
	public String getTypeOfAnimal()
	{
		return typeOfAnimal;
	}
	public String getName()
	{
		return name;
	}
	public int getRest()
	{
		return rest;
	}

	public void setSpeed(int A)
	{
		speed = A;
	}
	public void setName(String A)
	{
		name = A;
	}
	public void setTypeOfAnimal(String A)
	{
		typeOfAnimal = A;
	}
	public void setRest(int A)
	{
		rest = A;
	}


	public void run()
	{
		int totalDistanceCovered = 0;
		int count = 0;
		int oneLap = 400;

		try
		{
			while(totalDistanceCovered < totalDistance)
			{
				if(count % 4 == 0 && totalDistanceCovered != 0)
				{
					System.out.println(this.getName()+" has run \t" + totalDistanceCovered + "m!\n");
				}
				totalDistanceCovered += this.getSpeed();
				Thread.sleep(this.getRest());
				count++;

			}
			System.out.println("\t\t\t" + this.getName() + " has finished!");
		}
		catch(InterruptedException e)
		{
		}

	}

	public void prompt()
	{
		Scanner userInput = new Scanner(System.in);

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