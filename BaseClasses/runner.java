public class runner implements Runnable
{
	runner(){}

	public void run()
	{
		try
		{

			Thread.sleep(100);
			System.out.println("");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}