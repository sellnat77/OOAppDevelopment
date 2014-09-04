/*
 * Name   : Russell Tan
 * Date   : 26 August 2014 
 * Purpose: LotteryTicket class to be added to the array list
 * Inputs : NA
 * Output : single lottery ticket with 6 unique numbers
 */

import java.util.*;

public class LotteryTicket 
{
	private ArrayList<Integer> lottoNumbers = new ArrayList<Integer>();
	
	/**
	 * Default Constructor
	 */
	LotteryTicket(){}
	
	/**
	 * Mutators
	 */
	public void setLottoNumbers(int loc, int value)
	{
		lottoNumbers.set(loc, value);
	}
	
	/**
	 * Accessors
	 */
	public int getLottoNumbers(int loc)
	{
		return lottoNumbers.get(loc);
	}
	
	/**
	 * Adds a number to the private array list
	 */
	public void addLottoNumbers(int value)
	{
		lottoNumbers.add(value);
	}
	
	/**
	 * Prints the full lottery ticket in a formatted manner
	 */
	public void printTicket()
	{
		int k;
		
		System.out.print("\n");
		
		for(k = 0; k < 6; k++)
		{
			//Removes the comma from the end of the array
			if(k == 5)
			{
				System.out.format("\t%2d\n", lottoNumbers.get(k));
			}
			else
			{
				System.out.format("\t%2d, ", lottoNumbers.get(k));
			}
		}
	}

	/**
	 * Sorting needs to occur in this class to sort the private array list
	 */
	public void sortNumbers() 
	{
		Collections.sort(lottoNumbers);		
	}

	/**
	 * Grabs one number in array list and compares it to the rest
	 * if one duplicate is found the number is assigned a new random number
	 * and the boolean is set to false to escape 
	 * the inner for loop. to do{} statement is performed until the inner for loop
	 * goes through all the numbers without finding a match with index[j]       	 
	 */
	public void removeDuplicates()
	{
		int j,k;		
		boolean duplicate;
		
		for(j = 0; j < 6; j++)
		{
			do
			{
				duplicate = true;
				for(k = 0; duplicate && k < j; k++)
				{
					if(lottoNumbers.get(k) == lottoNumbers.get(j))
					{
						this.setLottoNumbers(j, (int)((Math.random()*49)+1));
						duplicate = false;
					}
				}
			}
			while(!duplicate);
		}		
	}
}
