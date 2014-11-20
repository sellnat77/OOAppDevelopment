public class threadRunners implements Runnable
{
	private int speed;
	private String typeOfAnimal;
	private String name;
	private int totalDistance = 800;

	threadRunners(int A, String B, String C)
	{
		speed = A;
		typeOfAnimal = B;
		name = C;
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


	public void run()
	{
		int totalDistanceCovered = 0;

		try
		{
			while(totalDistanceCovered < totalDistance)
			{
				totalDistanceCovered += this.getSpeed();
				Thread.sleep(100);
				System.out.println(this.getName()+" has run " + totalDistanceCovered + " meters!");
			}
			System.out.println(this.getName() + " has finished!");
		}
		catch(InterruptedException e)
		{
		}

	}



}