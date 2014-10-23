/*
 * Name: Russell Tan
 * Date: 10/22/2014
 * Purpose: Compile regex patterns and display the counts
 *			in scrabble.txt also write some to a file
 * Inputs: scrabble.txt file
 * Outputs: Counts of matches of the corresponding patterns
 * 			File with a set of matches, QNoU.txt
 */

public class RegexTester
{
	public static void main(String Theory[])
	{
		//Initialize the regex reader
		RegexReader read = new RegexReader();
		//Read Scrabble.txt
		read.readScrabble();
	}
}