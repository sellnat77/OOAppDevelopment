/*
 * Name: Russell Tan
 * Date:
 * Purpose:
 * Inputs:
 * Outputs:
 */

import javax.swing.*;
import java.util.*;
import java.io.*;
public class memoReader
{
	private Scanner userInput = new Scanner(System.in);
	memoReader(){}

	void readFromFile()
	{
		int k,y;
		String buffer = "";
		int more = 1;

		JOptionPane.showMessageDialog(null,"Please select your memo file");
		try
		{
		    JFileChooser chooser = new JFileChooser();
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
			    File selectedFile = chooser.getSelectedFile();
			    Scanner in = new Scanner(selectedFile);

			    while(more == 1)
			    {
					y = JOptionPane.showConfirmDialog(null,"Would you like to see the next memo?");
					if(y == JOptionPane.YES_OPTION)
					{
						for(k = 0; k < 3; k++)
						{
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
							else
							{
								JOptionPane.showMessageDialog(null,"No more memos!");
								more = 2;
								break;
							}
						}

				    }
				    else
					{
					    more = 2;
						break;
					}
				    if(more == 1)
				    {
					    JOptionPane.showMessageDialog(null,buffer);
				        buffer = "";
				    }
				    else
				    {
				 	    break;
				    }
			   }
			}
		}
		catch(FileNotFoundException error)
		{
			error.printStackTrace();
		}
	}
}