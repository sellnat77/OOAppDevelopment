import java.util.*;
public class runner implements Runnable
{
	runner (){}
	public void run()
	{
		try
		{
			Thread.sleep(200);
			System.out.println("Hello, I am " + Thread.currentThread().getName());
		}
		catch(InterruptedException e)
		{
		}
	}
}