/*
 * Name   : Russell Tan
 * Date   : 26 August 2014
 * Purpose: Print desired number of lottery tickets with 6 unique random numbers
 * Inputs : (int) number of tickets to print
 * Output : Number of lottery tickets with 6 unique random numbers
 */

public class LotteryCall
{
	public static void main(String args[])
	{
		TicketGenerator megaMillions = new TicketGenerator();
		
		megaMillions.promtpGameSize();
		megaMillions.createLottoTickets(megaMillions.getGameSize());
		megaMillions.printTickets();		
	}
}
