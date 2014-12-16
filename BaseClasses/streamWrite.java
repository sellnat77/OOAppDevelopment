import java.util.*;
import java.io.*;

public class streamWrite
{
	public static void main(String args[])
	{
		outObj item = new outObj();

		FileOutputStream oStream = null;
		ObjectOutputStream ooStream = null;

		try
		{
			oStream = new FileOutputStream("stream.ser");
			ooStream = new ObjectOutputStream(oStream);

			item.setValues();

			ooStream.writeObject(item);
			ooStream.close();

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}