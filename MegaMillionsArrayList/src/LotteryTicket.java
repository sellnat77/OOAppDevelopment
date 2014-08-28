/*
 * Name   : Russell Tan
 * Date   : 26 August 2014 
 * Purpose: LotteryTicket class to be added to the array list
 * Inputs : NA
 * Output : single lottery ticket with 6 unique numbers
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LotteryTicket 
{
	private ArrayList<Integer> lottoNumbers = new ArrayList<Integer>()];
	
	//Default Constructor
	LotteryTicket(){}
	
	/*Mutators and accessors*/
	public void setLottoNumbers(int loc, int value)
	{
		lottoNumbers[loc] = value;
	}
	
	public int getLottoNumbers(int loc)
	{
		return lottoNumbers[loc];
	}
	
	/*Prints the full lotto ticket in a formatted manner*/
	public void printTicket()
	{
		int k;
		
		System.out.print("\nTicket numbers: ");
		
		for(k = 0; k < 6; k++)
		{
			//Removes comma from the end of the array
			if(k == 5)
			{
				System.out.format("%2d\n", lottoNumbers[k]);
			}
			else
			{
				System.out.format("%2d, ", lottoNumbers[k]);
			}
		}
	}

	/*Sorting needs to occur here to sort the private array*/
	public void sortNumbers() 
	{
		Collections.sort(lottoNumbers);		
	}

	/*replaces duplicates in the array when a duplicate is found and repeatedly 
	 * goes through the array until all the numbers are unique            	 */
	public void removeDuplicates()
	{
		int k;
		boolean isDuplicate = true;
		
		while(isDuplicate)
		{
			for( k = 1; k < lottoNumbers.length; k++)
			{
				//Reset the bool to loop the the array again
				isDuplicate = true;
				if(lottoNumbers[k-1] == lottoNumbers[k])
				{
					this.setLottoNumbers(k-1, (int)((Math.random()*49)+1));
				}
				else
				{
					isDuplicate = false;
				}				
			}			
		}
	}
}
