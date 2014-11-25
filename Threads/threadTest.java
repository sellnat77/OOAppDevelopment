import java.util.*;
public class threadTest
{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner (System.in);
		int place = 1;
		int num = 0;
		threadRunners dog = new threadRunners();
		threadRunners cat = new threadRunners();
		threadRunners turtle = new threadRunners();
		threadRunners crocodile = new threadRunners();
		threadRunners cheetah = new threadRunners();

		System.out.println("How many animals are in the race?");
		num = userInput.nextInt();

		threadRunners[] animals = new threadRunners[num];
		Thread[] t = new Thread[num];

		for(int k = 0; k < num; k++)
		{
			animals[k] = new threadRunners();
			animals[k].prompt();
			t[k] = new Thread(animals[k]);
		}
		for(int k = 0; k < num; k++)
		{
			t[k].start();
		}

		//Thread t1 = new Thread(cat);
		//Thread t2 = new Thread(turtle);
		//Thread t3 = new Thread(crocodile);
		//Thread t4 = new Thread(cheetah);

		//t1.start();
		//t2.start();
		//t3.start();
		//t4.start();



	}
}