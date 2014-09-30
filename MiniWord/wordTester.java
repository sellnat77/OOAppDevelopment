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
		word.moveRight();
		word.insertChar('p');
		word.insertChar('p');
		word.moveLeft();
		word.moveLeft();
		word.moveLeft();
		word.moveLeft();
		word.moveLeft();
	System.out.println(word.toStringCursor());

	}
}