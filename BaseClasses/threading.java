import java.util.*;
public class threading
{
	public static void main(String args[])
	{
		Scanner userIn = new Scanner(System.in);
		runner run = new runner();

		Thread t = new Thread(run);

		t.start();
	}

}