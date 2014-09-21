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
		int k;
		String buffer = "";
		int more = 1;
		try
		{

			JFileChooser chooser = new JFileChooser();
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
			   File selectedFile = chooser.getSelectedFile();
			   Scanner in = new Scanner(selectedFile);

			   while(more == 1)
			   {
				   for(k = 0; k < 3; k++)
			   	   {
					   if(in.hasNextLine())
					   {
						   switch(k)
						   {
						   case 0:
						         buffer += "\nSUBJECT:    " + in.nextLine();
						         break;
						   case 1:
						   		 buffer += "\nDate Written:    " + in.nextLine();
						   		 break;
						   case 2:
						   		 buffer += "\nMEMO:    " + in.nextLine();
						   		 break;
						   default:
						   		 break;
						    }
					   }
					   else
					   {
						   System.out.println("You are out of memos!");
						   buffer = "No more memos!";
						   more = 2;
						   break;
					   }
				   }
				   if(more == 1)
				   {
					   JOptionPane.showMessageDialog(null,buffer);
					   buffer = "";
					   System.out.println("\n\n\nWould you like to see the next memo?");
					   System.out.println("\t1)Yes please!");
					   System.out.println("\t2)No thats okay.");
					   try
					   {
							more = userInput.nextInt();
					   }
					   catch(InputMismatchException e)
					   {
						   System.out.println("Enter either 1 or 2!");
						   userInput.next();
						   more = userInput.nextInt();
					   }
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

	void readMultipleMemos()
	{
		int choice = 1;
		while( choice == 1 )
		{
			this.readFromFile();

		}

	}
}