import java.io.*;
import java.util.*;

public class fileThread implements Runnable
{
	private String path;

	fileThread(String p)
	{
		path = p;
	}

	public void run()
	{
		try
		{
			File theFile =new File(path);
			Scanner in = new Scanner(theFile);
			int count = 0;

			while(in.hasNext())
			{
				in.next();
				count++;
			}
			System.out.println(path + ": " + count + " words");

		}
		catch(FileNotFoundException error)
		{
			error.printStackTrace();
		}
	}

}