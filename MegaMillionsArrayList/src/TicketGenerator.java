import java.util.ArrayList;
import java.util.Collections;


public class TicketGenerator 
{
	private ArrayList<LotteryTicket> lotteryTicket = new ArrayList<LotteryTicket>();
	
	static int timesChecked = 0;
	
	TicketGenerator(){}
	
	void addNumbers(int setsToGenerate)
	{
		int j,k;
		
		for(j = 0; j < setsToGenerate; j++)
		{
			LotteryTicket singleTicket = new LotteryTicket();
			for(k = 0; k < 6; k++)
			{
				singleTicket.setLottoNumbers(k, this.randomNumber(49, 1));
			}
			singleTicket.sortNumbers();	
			singleTicket.removeDuplicates();
			singleTicket.sortNumbers();	
			lotteryTicket.add(singleTicket);
		}
	}
	
	
	int randomNumber(int max, int min)
	{		
		return (int)((Math.random()*max)+min);		
	}
		
		
	
	void printTickets()
	{
		int k;
		
		for(k = 0; k < lotteryTicket.size(); k++)
		{
			lotteryTicket.get(k).printTicket();
		}
	}
}
