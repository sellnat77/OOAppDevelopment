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

	public void readScrabbleZZ(int choice)
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
						switch(choice)
						{
							case 1:
								System.out.printf("%15s\t",this.checkZ(text));
								break;
							case 2:
								System.out.printf("%15s\t",this.checkX(text));
								break;
							case 3:
								System.out.printf("%15s\t",this.checkVow(text));
								break;
							case 4:
								System.out.printf("%15s\t",this.checkBigVow(text));
								break;
							case 5:
								System.out.printf("%15s\t",this.checkQNoU(text));
								break;
							default:
							break;
						}

					}
				}
				System.out.println("");
			}



		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
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

	public int getInput()
	{
		Scanner userIn = new Scanner(System.in);
		int input = 0;

		while(!userIn.hasNextInt())
		{
			System.out.println("1)ZZ ");
			System.out.println("2)xx ");
			System.out.println("3)vowels ");
			System.out.println("4)big vowels ");
			System.out.println("5)q no u ");
			System.out.println("What would you like to do?");
			userIn.next();
			input = userIn.nextInt();
		}
		return input;

	}
}