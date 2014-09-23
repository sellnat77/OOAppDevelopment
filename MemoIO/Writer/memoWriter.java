/*
 * Name   : Russell Tan
 * Date   : September 21, 2014
 * Purpose: Create object to allow user to write and store memos to a file
 * Inputs : Number of memos, subject, message
 * Outputs: NA
 */

import java.io.*;
import javax.swing.*;

public class memoWriter
{
	private java.util.Date stamp;

	//Default constructor instantiates a date variable
	memoWriter()
	{
		stamp = new java.util.Date();
	}

	//Writes one memo to a file, appends new memos
	void writeToFile()
	{

		try
		{
			PrintWriter write = new PrintWriter(new FileWriter("memo.txt",true));
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

	//Allows user to specify how many memos they wish to write
	void writeMultipleMemos()
	{
		int k,writeAnother;

		//If the user enters something other than a number, they are prompted to enter a number until they successfully do so
		while(true)
		{
			this.writeToFile();
			writeAnother = JOptionPane.showConfirmDialog(null,"Would you like to write another memo?");
			if(writeAnother != JOptionPane.YES_OPTION)
			{
				break;
			}
		}
	}
}