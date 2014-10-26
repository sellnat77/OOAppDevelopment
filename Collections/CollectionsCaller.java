/*
 * Name: Russell Tan
 * Date: October 26, 2014
 * Purpose: Determine pont values of scrabble words and analyze time difference between
 *          Tree and hash set assignments
 * Inputs: QNoU.txt points.txt
 * Outputs: Point values of words and time taken by a large tree and hash set assignment
 */

public class CollectionsCaller
{
	public static void main(String args[])
	{
		CollectionsMaps coll = new CollectionsMaps();

		//Read scrabble points and print point values of words in QNoU.txt
		coll.readScabble();

		//Adds large text file to tree and has map and print the time taken by each
		coll.largeSets();
	}
}