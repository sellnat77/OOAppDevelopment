import javax.swing.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class RegexReader
{
	private Scanner userInput = new Scanner(System.in);
	private String text;
	Pattern zz = Pattern.compile("zz");
	Pattern xx = Pattern.compile("xx");
	Pattern vow = Pattern.compile("[aeiou].+[aeiou].");
	Pattern bigVow = Pattern.compile("[aeiou].+[aeiou].+[aeiou]");
	Pattern qNoU = Pattern.compile("^q+!u");

	RegexReader(){}

	public void readScrabble()
	{

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
					if(this.checkZ(text)!= null)
					{
						System.out.printf("%15s\t",this.checkZ(text));
					}
				}
				System.out.println("");
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

	public String checkZ(String text)
	{
		Matcher zzm = zz.matcher(text);
		if(zzm.find())
		{
			return text;
		}
		else
		{
			return null;
		}
	}
	public String checkX(String text)
	{
		Matcher xxm = xx.matcher(text);
		if(xxm.find())
		{
			return text;
		}
		else
		{
			return null;
		}
	}
	public String checkVow(String text)
	{
		Matcher vowm = vow.matcher(text);
		if(vowm.find())
		{
			return text;
		}
		else
		{
			return null;
		}
	}
	public String checkBigVow(String text)
	{
		Matcher bigVowm = bigVow.matcher(text);
		if(bigVowm.find())
		{
			return text;
		}
		else
		{
			return null;
		}
	}
	public String checkQNoU(String text)
	{
		Matcher qNoUm = qNoU.matcher(text);
		if(qNoUm.find())
		{
			return text;
		}
		else
		{
			return null;
		}
	}
}