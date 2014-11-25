public class threadTest
{
	public static void main(String args[])
	{
		int place = 1;
		threadRunners dog = new threadRunners(10,100,"dog","spot");
		threadRunners cat = new threadRunners(20,50,"cat","sam");
		threadRunners turtle = new threadRunners(10,300,"turtle","noob");
		threadRunners crocodile = new threadRunners(40,200,"croc","lenny");
		threadRunners cheetah = new threadRunners(200,25,"cheetah","mark");


		Thread t = new Thread(dog);
		Thread t1 = new Thread(cat);
		Thread t2 = new Thread(turtle);
		Thread t3 = new Thread(crocodile);
		Thread t4 = new Thread(cheetah);


		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		if(!t.isAlive())
		{
			System.out.println("in " + place + "!");
			place++;
		}
		if(!t1.isAlive())
				{
					System.out.println("in " + place + "!");
					place++;
		}
		if(!t2.isAlive())
				{
					System.out.println("in " + place + "!");
					place++;
		}
		if(!t3.isAlive())
				{
					System.out.println("in " + place + "!");
					place++;
		}
		if(!t4.isAlive())
				{
					System.out.println("in " + place + "!");
					place++;
		}

	}
}