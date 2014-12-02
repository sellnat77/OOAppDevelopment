import java.util.*;

public class TestThreadMany
{
	public static void main(String args[])
	{
		Scanner userIn = new Scanner(System.in);
		System.out.println("How many threads?");
		int size = userIn.nextInt();

		Thread[] t = new Thread[size];
		runner run = new runner();
		int k;

		for(k = 0; k < size; k++)
		{
			t[k] = new Thread(run);
			t[k].start();
		}
	}
}