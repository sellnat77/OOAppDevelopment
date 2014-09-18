import java.io.*;
import javax.swing.*;
public class memoWriter
{
	private java.util.Date stamp;
	memoWriter()
	{
		stamp = new java.util.Date();
	}

	void writeToFile()
	{
		String temp;
		try
		{
			PrintWriter write = new PrintWriter("memo.txt","UTF-8");
			temp = JOptionPane.showInputDialog("Eneter the subject of the memo.");
			write.println(temp);
			stamp = new java.util.Date();
			write.println(stamp.toString());
			temp = JOptionPane.showInputDialog("Eneter the message of the memo.");
			write.println(temp);
			write.close();
		}
		catch(IOException oops)
		{
			System.out.println("Error writng to file.");
			oops.printStackTrace();
		}

	}
}