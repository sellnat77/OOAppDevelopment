/*
 * Name   : Russell Tan
 * Date   : October 11, 2014
 * Purpose: Test the measurable generic class given a variety of arraylists
 * Inputs : int, string, double, character arraylists
 * Output : The entire array list and the largest value of each
 */

import java.util.*;

public class genericTest
{
	public static void main(String theory[])
	{
		//Instantiate different arraylists with different wrapper classes
		ArrayList<Integer> iValues = new ArrayList<Integer>();
		ArrayList<String> sValues = new ArrayList<String>();
		ArrayList<Double> dValues = new ArrayList<Double>();
		ArrayList<Character> cValues = new ArrayList<Character>();

		//Instantiate the generic class
		Measurable measure = new Measurable();


		//Integer array list
		iValues.add(9);
		iValues.add(20);
		iValues.add(4);
		iValues.add(6);

		//String array list
		sValues.add("alphabet");
		sValues.add("string");
		sValues.add("LOL");
		sValues.add("Caribou");

		//Double array list
		dValues.add(3.7);
		dValues.add(9.1);
		dValues.add(48.7);
		dValues.add(6007.324);

		//Character array list
		cValues.add('a');
		cValues.add('t');
		cValues.add('r');
		cValues.add('g');

		System.out.println("Integer array list is...\n");
		measure.print(iValues);
		System.out.println("\nString array list is...\n");
		measure.print(sValues);
		System.out.println("\nDouble array list is...\n");
		measure.print(dValues);
		System.out.println("\nCharacter array list is...\n");
		measure.print(cValues);
		System.out.println("\n\nINT    MAX : " + measure.max(iValues));
		System.out.println("STRING MAX :" + measure.max(sValues));
		System.out.println("DOUBLE MAX :" + measure.max(dValues));
		System.out.println("CHAR   MAX : " + measure.max(cValues));

	}
}