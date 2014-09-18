import javax.swing.*;
import java.util.*;
import java.io.*;
public class memoReader
{
	memoReader()
	{
	}

	void readFromFile()
	{
		int k;
		try
		{

			JFileChooser chooser = new JFileChooser();
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
			   File selectedFile = chooser.getSelectedFile();
			   Scanner in = new Scanner(selectedFile);

			   for(k = 0; k < 3; k++)
			   {
				   System.out.println(in.nextLine());
			   }
			}
		}
		catch(FileNotFoundException error)
		{
			error.printStackTrace();
		}
	}
}