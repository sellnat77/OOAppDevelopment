/*
 * Name   : Russell Tan
 * Date   : September 21, 2014
 * Purpose: Allow user to read from a file
 * Inputs : NA
 * Outputs: Memos written by user previously
 */

import javax.swing.*;
import java.util.*;
import java.io.*;

public class memoReader
{
	//Instantiate a Scanner to read from file
	private Scanner userInput = new Scanner(System.in);

	//Default constructor
	memoReader(){}

	//Method to read 3-line memos as long as there are memos in the file
	void readFromFile()
	{

		int k,y;
		String buffer = "";
		int more = 1;

		//Inform user of JFileChooser
		JOptionPane.showMessageDialog(null,"Please select your memo file");

		//Try/Catch to cover file not found exception
		try
		{
		    JFileChooser chooser = new JFileChooser();

			//If file exists contiue to read from file
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
				//Apply the scanner to the chosen file
			    File selectedFile = chooser.getSelectedFile();
			    Scanner in = new Scanner(selectedFile);

			    //Loops as long as there are memos in the file
			    while(more == 1)
			    {
				    y = JOptionPane.showConfirmDialog(null,"Would you like to see the next memo?");

					if(y == JOptionPane.YES_OPTION)
					{
						for(k = 0; k < 3; k++)
						{
							//Concat the lines of the memo to be output in the message dialog
							if(in.hasNextLine())
							{
								switch(k)
								{
									case 0: buffer += "\nSUBJECT:    " + in.nextLine();
											break;

									case 1: buffer += "\nDate Written:    " + in.nextLine();
											break;

									case 2: buffer += "\nMEMO:    " + in.nextLine();
											break;

									default:break;
								}
							}

							//If the file no longer has data break out of the loop
							else
							{
								buffer = "No more memos!";
								more = 2;
								break;
							}

						}
						//Output the memo to the user
						JOptionPane.showMessageDialog(null,buffer);
				        buffer = "";
				    }

				    //If the user chooses 'no' or 'cancel' exit the program
				    else
					{
					    more = 2;
						break;
					}
			    }
			}
		}

		//Catch case if file is not found
		catch(FileNotFoundException error)
		{
			error.printStackTrace();
		}
	}
}