public class threadTest
{
	public static void main(String args[])
	{
		threadRunners dog = new threadRunners(10,"dog","spot");
		threadRunners cat = new threadRunners(20,"cat","sam");
		threadRunners turtle = new threadRunners(10,"turtle","noob");
		threadRunners crocodile = new threadRunners(40,"croc","lenny");
		threadRunners cheetah = new threadRunners(200,"cheetah","mark");


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
	}
}