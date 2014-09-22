/*
 * Name   : Russell Tan
 * Date   : September 21, 2014
 * Purpose: Prompt user how many memos they wish to write
 * Inputs : Number of memos, subject, and message
 * Outputs: NA
 */

public class writeMemo
{
    public static void main(String theory[])
    {
		//Instantiate a writer object with default constructor
		memoWriter pencil = new memoWriter();

		//Utilize the multiple memo method to ask user how many they wish to write
		pencil.writeMultipleMemos();
    }
}