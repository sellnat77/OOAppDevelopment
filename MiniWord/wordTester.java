/*
 * Name   : Russell Tan
 * Date   : September 23, 2014
 * Purpose: Testing of mini word processor
 * Inputs :
 * Outputs:
 */

public class wordTester
{
	public static void main(String Theory[])
	{
		miniWord word = new miniWord();

		word.insertChar('r');
		word.insertChar('u');
		word.insertChar('s');

		word.insertChar('s');
		word.insertChar('e');
		word.insertChar('l');


		word.insertChar('l');
		word.insertChar('!');
		//word.moveRight();
		word.insertChar('p');
		word.insertChar('p');
	System.out.println(word.toString());

	}
}