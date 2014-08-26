import java.util.ArrayList;
import java.util.Collections;


public class TicketGenerator 
{
	private ArrayList<Integer> lotteryTicket = new ArrayList<Integer>();
	
	TicketGenerator(){}
	
	void addNumbers(int setsToGenerate, int numbersPerSet)
	{
		int j,k;
		
		for(j = 0; j < setsToGenerate; j++)
		{
			for(k = 0; k < numbersPerSet; k++)
			{
				lotteryTicket.add(this.randomNumber(49, 1));
			}
			Collections.sort(lotteryTicket);
			this.printTicket();
			lotteryTicket.clear();
		}
	}
	
	void printTicket()
	{
		int k;
		
		System.out.print("Ticket numbers: ");
		for(k = 0; k < lotteryTicket.size(); k++)
		{
			if(k == lotteryTicket.size()-1)
			{
				System.out.println(lotteryTicket.get(k));
			}
			else
			{
				System.out.print(lotteryTicket.get(k)+", ");
			}
		}
	}
	
	int randomNumber(int max, int min)
	{		
		return (int)((Math.random()*max)+min);		
	}
	
	void checkDoubles(int numberToCheck)
	{		
		int k,tempNumberToCheck;
		
		
		
		tempNumberToCheck++;
		checkDoublea(tempNumberToCheck);
		
	}
	
}
