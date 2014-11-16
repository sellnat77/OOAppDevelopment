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

		word.processCommand("insert [u]");
		word.processCommand("insert [s]");
		word.processCommand("insert [s]");
		word.processCommand("insert [e]");
		word.processCommand("insert [l]");
		word.processCommand("insert [l]");
		word.processCommand("insert [ ]");
		word.processCommand("insert [t]");
		word.processCommand("insert [a]");
		word.processCommand("insert [n]");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("right");
		word.processCommand("right");
		word.processCommand("insert [a]");
		word.processCommand("insert [b]");
		word.processCommand("insert [c]");
		word.processCommand("delete");
		word.processCommand("delete");
		word.processCommand("backspace");
		word.processCommand("insert [d]");
		word.processCommand("insert [e]");
		word.processCommand("insert [f]");
		word.processCommand("start");
		word.processCommand("insert [g]");
		word.processCommand("insert [h]");
		word.processCommand("insert [i]");
		word.processCommand("insert [j]");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("find [j]");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("right");
		word.processCommand("right");
		word.processCommand("insert [q]");
		word.execute();

	}
}