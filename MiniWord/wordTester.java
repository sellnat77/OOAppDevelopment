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
		miniWord word = new miniWord("HOCUSPOCUS");

		word.processCommand("insert [a]");
		word.processCommand("insert [b]");
		word.processCommand("insert [c]");
		word.processCommand("insert [d]");
		word.processCommand("insert [e]");
		word.processCommand("insert [f]");
		word.processCommand("insert [g]");
		word.processCommand("insert [h]");
		word.processCommand("insert [i]");
		word.processCommand("insert [j]");



		word.processCommand("insert [k]");
		word.processCommand("insert [l]");
		word.processCommand("insert [m]");
		word.processCommand("insert [n]");
		word.processCommand("insert [o]");
		word.processCommand("insert [p]");
		word.processCommand("insert [q]");
		word.processCommand("insert [r]");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("find [r]");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");
		word.processCommand("left");

		word.processCommand("insert [r]");
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

		word.processCommand("insert [s]");
		word.processCommand("insert [t]");
		word.processCommand("insert [u]");
		word.processCommand("insert [v]");
		word.processCommand("backspace");
		word.processCommand("backspace");
		word.processCommand("start");
		word.processCommand("find [t]");
		word.processCommand("delete");
		word.processCommand("delete");
		word.processCommand("insert [w]");
		word.processCommand("insert [x]");
		word.processCommand("insert [y]");
		word.processCommand("insert [z]");
		word.execute();

	}
}