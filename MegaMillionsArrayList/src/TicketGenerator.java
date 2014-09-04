/*
 * Name   : Russell Tan
 * Date   : 26 August 2014 
 * Purpose: Generate random numbers and print the tickets
 * Inputs : NA
 * Output : list of the lottery tickets
 */
import java.util.*;

public class TicketGenerator 
{
	private int gameSize;
	private LotteryTicket singleTicket;
	private Scanner userInput = new Scanner(System.in);
	private ArrayList<LotteryTicket> tickets = new ArrayList<LotteryTicket>();
	
	/**
	 * Default constructor
	 */
	TicketGenerator(){}
	
	/**
	 * Full Constructor
	 */
	TicketGenerator(int size)
	{
		gameSize = size;
	}
	
	/**
	 * Mutators
	 */
	public void setGameSize(int size)
	{
		gameSize = size;
	}
	
	/**
	 * Accessors
	 */
	public int getGameSize()
	{
		return gameSize;
	}
	
	/**
	 * Prompts user for the game size, prompts again if input is invalid
	 */
	public void promtpGameSize()
	{
		System.out.println("How many lotto tickets would you like to buy?");		
		
		try
		{
			this.setGameSize(userInput.nextInt());
			
			if(this.getGameSize() <= 0)
			{
				System.out.println("You must buy 1 or more tickets, try again.");
				this.promtpGameSize();
			}
		}
		catch(InputMismatchException error)
		{
			//Scanner.next() used to move scanner from the char/string 
			//in order to allow for input of an int on the next iteration
			System.out.println("That is not a number, try again.");
			userInput.next();
			this.promtpGameSize();
		}		
	}
	
	/**
	 * Adds numbers to the lotteryTicket array list from the lotteryTicket class
	 * Sorts the numbers and replaces the duplicates with another number
	 * then sorts again													
	 */
	public void createLottoTickets(int setsToGenerate)
	{
		int j,k;
		
		for(j = 0; j < setsToGenerate; j++)
		{
			//Instantiate a new LotteryTicket for the array list
			singleTicket = new LotteryTicket();
			
			for(k = 0; k < 6; k++)
			{
				singleTicket.addLottoNumbers(this.randomNumber(49, 1));
			}
			
			//Array list is sorted first to help finding duplicates
			singleTicket.sortNumbers();	
			singleTicket.removeDuplicates();

			//Sorted again after duplicates replaced for formatting purposes
			singleTicket.sortNumbers();
			
			tickets.add(singleTicket);
		}
	}
	
	/**
	 * Random number generator
	 */
	public int randomNumber(int max, int min)
	{		
		return (int)((Math.random()*max)+min);		
	}		
	
	/**
	 * Prints the all the lottery tickets after 
	 * they have been added to the array list 
	 */
	public void printTickets()
	{
		int k;
		
		for(k = 0; k < tickets.size(); k++)
		{
			tickets.get(k).printTicket();
		}
	}
}
