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
						   System.out.println(in.nextLine());
					   }
					   else
					   {
						   System.out.println("You are out of memos!");
						   break;
					   }
				   }
					   System.out.println("Would you like to see the next memo?");
					   System.out.println("\t1)Yes please!");
					   System.out.println("\t2)No thats okay.");
					   try
					   {
					   		more = userInput.nextInt();
					   }
					   catch(InputMismatchException e)
					   {
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