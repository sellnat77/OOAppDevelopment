import javax.swing.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class RegexReader
{
	private Scanner userInput = new Scanner(System.in);
	private String text;

	RegexReader(){}

	public void readScrabble()
	{
		Pattern zz = Pattern.compile("[z].+[z].");
		Pattern xx = Pattern.compile("[xx]");
		Pattern vow = Pattern.compile("[aeiou].+[aeiou].");
		Pattern bigVow = Pattern.compile("[aeiou].+[aeiou].+[aeiou]");
		Pattern qNoU = Pattern.compile("^q+!u");
		try
		{
			JFileChooser fileC = new JFileChooser();
			if(fileC.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{

				File scrab = fileC.getSelectedFile();
				Scanner input = new Scanner(scrab);

				while(input.hasNext())
				{
					text = input.nextLine();
					Matcher zzm = zz.matcher(text);
					Matcher xxm = xx.matcher(text);
					Matcher vowm = vow.matcher(text);
					Matcher bigVowm = bigVow.matcher(text);
					Matcher qNoUm = qNoU.matcher(text);

					if(zzm.find())
					{
						System.out.println(text);
					}
				}
			}



		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally

		{
		}
	}

}