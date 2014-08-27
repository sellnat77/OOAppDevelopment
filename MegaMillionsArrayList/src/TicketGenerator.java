import java.util.ArrayList;


public class TicketGenerator 
{
	private ArrayList<LotteryTicket> lotteryTicket = new ArrayList<LotteryTicket>();
	LotteryTicket singleTicket = new LotteryTicket();
	static int timesChecked = 0;
	
	TicketGenerator(){}
	
	void addNumbers(int setsToGenerate)
	{
		int j,k;
		
		for(j = 0; j < setsToGenerate; j++)
		{
			for(k = 0; k < 6; k++)
			{
				singleTicket.setLottoNumbers(k, this.randomNumber(49, 1));
			}
			singleTicket.sortNumbers();			
			lotteryTicket.add(singleTicket);
			singleTicket.reset();
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
			lotteryTicket.get(0).printTicket();
			lotteryTicket.get(1).printTicket();
			lotteryTicket.get(2).printTicket();
		}
	}
}
