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

		word.processCommand("insert char[r]");

		word.processCommand("insert char[u]");
		word.processCommand("insert char[s]");
		word.processCommand("insert char[s]");
		word.processCommand("insert char[e]");
		word.processCommand("insert char[l]");
		word.processCommand("insert char[l]");
		word.processCommand("insert char[l]");
		word.processCommand("move right");
		word.processCommand("insert char[ ]");
		word.processCommand("insert char[t]");
		word.processCommand("insert char[a]");
		word.processCommand("insert char[n]");
		word.processCommand("move left");
		word.processCommand("move left");
		word.processCommand("move left");
		word.processCommand("move left");
		word.processCommand("move left");
		word.processCommand("insert char[q]");
		word.execute();

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