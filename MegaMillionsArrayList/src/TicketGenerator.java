/*
 * Name   : Russell Tan
 * Date   : 26 August 2014 
 * Purpose: Generate random numbers and print the tickets
 * Inputs : NA
 * Output : list of the lottery tickets
 */
import java.util.ArrayList;

public class TicketGenerator 
{
	private ArrayList<LotteryTicket> tickets = new ArrayList<LotteryTicket>();
	private LotteryTicket singleTicket;
	
	//Default constructor
	TicketGenerator(){}
	
	/*Adds numbers to the lotteryTicket array from the lotteryTicket class
	 * Sorts the numbers and replaces the duplicates with another number
	 * then sorts again														*/
	public void createLottoTickets(int setsToGenerate)
	{
		int j,k;
		
		for(j = 0; j < setsToGenerate; j++)
		{
			//Instantiate a new LotteryTicket for the arraylist
			singleTicket = new LotteryTicket();
			
			for(k = 0; k < 6; k++)
			{
				singleTicket.setLottoNumbers(k, this.randomNumber(49, 1));
			}
			
			singleTicket.sortNumbers();	
			singleTicket.removeDuplicates();
			singleTicket.sortNumbers();
			
			tickets.add(singleTicket);
		}
	}
	
	/*Random number generator*/
	public int randomNumber(int max, int min)
	{		
		return (int)((Math.random()*max)+min);		
	}		
	
	/*Prints the all the lotto tickets after they have been added to the AL */
	public void printTickets()
	{
		int k;
		
		for(k = 0; k < tickets.size(); k++)
		{
			tickets.get(k).printTicket();
		}
	}
}
