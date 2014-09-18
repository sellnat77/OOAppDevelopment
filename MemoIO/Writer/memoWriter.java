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
		try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter("memo.txt",true))))
		{
			String temp;

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

	void writeMultipleMemos()
	{
		int k,numberOfMemos;

		numberOfMemos = Integer.parseInt(JOptionPane.showInputDialog("How many memos do you want to write?"));

		for(k = 0; k < numberOfMemos; k++)
		{
			this.writeToFile();
		}
	}

}