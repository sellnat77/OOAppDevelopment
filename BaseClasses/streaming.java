import java.io.*;
import java.util.*;
public class streaming
{
	public static void main(String args[])
	{
		File text = new File("text.txt");

		int k = 1;

		try
		{
			FileInputStream in = new FileInputStream(text);

			while(in.available() != 0)
			{
				int temp = in.read();

				if(k%64 == 0)
				{
					k = 1; System.out.println("");
				}
				if(temp >= 32 && temp <= 126)
				{
					System.out.print((char)temp+" ");
					k++;
				}
			}
		}
		catch(FileNotFoundException e)
		{
		}
		catch(IOException e)
		{
		}

	}
}