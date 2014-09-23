import java.util.*;
import java.io.*;
public class zipReader
{
	public static void main(String[] args) throws Exception
	{
	    // Create a File instance
	    java.io.File file = new java.io.File("ziptable.txt");
	    //Create file instance for copies
	    java.io.File copyfile = new java.io.File("copyzips.txt");
	    //Create print writer
	    PrintWriter pencil = new PrintWriter(copyfile);

	    // Create a Scanner for the file
	    Scanner input = new Scanner(file);

	    // Read data from a file
		while (input.hasNext())
		{
			//show in console
			//System.out.println(input.nextLine());
			//show in file
			pencil.println(input.nextLine());

		}
		pencil.close();
	}
}