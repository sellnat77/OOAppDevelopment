/*
 * Name   : Russell Tan
 * Date   : 26 August 2014 
 * Purpose: Generate random numbers and print the tickets
 * Inputs : NA
 * Output : list of the lottery tickets
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketGenerator 
{
	private ArrayList<LotteryTicket> tickets = new ArrayList<LotteryTicket>();
	private LotteryTicket singleTicket;
	private Scanner userInput = new Scanner(System.in);
	
	//Default constructor
	TicketGenerator(){}
	
	public int promtpGameSize()
	{
		int size;
		boolean invalidNumber = true;
		size = 0;
		
		
		
		while(invalidNumber)
		{
			
			try
			{
				System.out.print("How many lottery tickets would you like to buy?: ");
				size = userInput.nextInt();
				if(size < 1)
				{
					System.out.println("Invalid Number, try again.");
					invalidNumber = true;
				}
				else if(size > 1)
				{
					invalidNumber = false;
				}
			}
			catch(InputMismatchException error)
			{
				System.out.println("Thats not a number! Try again.");
				invalidNumber = false;
				this.promtpGameSize();
			}
		}
		return size;		
	}
	
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
				singleTicket.addLottoNumbers(this.randomNumber(49, 1));
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
