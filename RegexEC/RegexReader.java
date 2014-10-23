/*
 * Name: Russell Tan
 * Date: 10/22/2014
 * Purpose: Compile regex patterns and display their counts
 *			in scrabble.txt also write some to a file
 * Inputs: scrabble.txt file
 * Outputs: Counts of matches of the corresponding patterns
 * 			File with a set of matches
 */

import javax.swing.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;
public class RegexReader
{
	//String to be used as my value to check against a pattern
	private String text;

	Pattern zz = Pattern.compile("zz");                            //Two consecutive z's
	Pattern xx = Pattern.compile("x.*?x.*?");                      //Only 2 x's in a word
	Pattern vow = Pattern.compile("[aeiou][aeiou]");               //Two consecutive vowels
	Pattern bigVow = Pattern.compile("[aeiou].*[aeiou].*[aeiou]"); //More than 2 vowels
	Pattern qNoU = Pattern.compile("^q[^u]");                      //Starts with q and not followed by a u

	//Default constructor
	RegexReader(){}

	//Main method to open the .txt and create qnou.txt to write to
	public void readScrabble()
	{
		//Initialize the counters for each pattern
		int zCount = 0;
		int xCount = 0;
		int vowCount = 0;
		int bigVowCount = 0;
		int qNoUCount = 0;

		//Initialize the writer outside the try block to properly close in finally clause
		PrintWriter write = null;
		try
		{

			File scrab = new File("scrabble.txt");
			Scanner input = new Scanner(scrab);

			write = new PrintWriter(new FileWriter("QNoU.txt"));

			while(input.hasNext())//While there exists text in the file
			{
				//Assign current line to the check value
				text = input.nextLine();

				//Check z's, if theres a match, increase the count
				if(this.checkZ(text))
				{
					zCount++;
				}
				//Check x's, if theres a match, increase the count
				if(this.checkX(text))
				{
					xCount++;

				}
				//Check 2 vowel's, if theres a match, increase the count
				if(this.checkVow(text))
				{
					vowCount++;

				}
				//Check more than two vowel's, if theres a match, increase the count
				if(this.checkBigVow(text))
				{
					bigVowCount++;

				}
				//Check if first letter is q not followed by u, if theres a match, increase the count
				//and write that word to the file
				if(this.checkQNoU(text))
				{
					qNoUCount++;

					//Write the match to the file created before
					write.println(text);
				}
			}
			//Print out the corresponding counts
			System.out.println("2 consecutive Z's: " + zCount);
			System.out.println("\n2 X's: " + xCount);
			System.out.println("\nTwo consecutive vowels: " + vowCount);
			System.out.println("\nMore than 2 vowels: " + bigVowCount);
			System.out.println("\nWords that start with Q and are not followed by a U: " + qNoUCount+"\n\n");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException er)
		{
			er.printStackTrace();
		}
		finally
		{
			write.close();
		}
	}
	//Two consec. z's
	public boolean checkZ(String text)
	{
		Matcher zzm = zz.matcher(text);
		if(zzm.find())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Two x's
	public boolean checkX(String text)
	{
		Matcher xxm = xx.matcher(text);
		if(xxm.find())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Two Vowels
	public boolean checkVow(String text)
	{
		Matcher vowm = vow.matcher(text);
		if(vowm.find())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//More than two vowels
	public boolean checkBigVow(String text)
	{
		Matcher bigVowm = bigVow.matcher(text);
		if(bigVowm.find())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//First letter q next letter is not u
	public boolean checkQNoU(String text)
	{
		Matcher qNoUm = qNoU.matcher(text);
		if(qNoUm.find())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}