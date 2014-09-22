/*
 * Name   : Russell Tan
 * Date   : September 21, 2014
 * Purpose: Allow user to read from a previously generated txt file
 * Inputs : NA
 * Outputs: Memos written previously
 */

public class reader
{
	public static void main(String thoery[])
	{
		//Instantiated a file reader object
		memoReader glasses = new memoReader();

		//Utilize the read method to read from preciously created file
		glasses.readFromFile();
	}
}