import java.util.Arrays;


public class LotteryTicket 
{
	private int lottoNumbers[] = new int[6];
	
	LotteryTicket(){}
	
	void setLottoNumbers(int loc, int value)
	{
		lottoNumbers[loc] = value;
	}
	
	int getLottoNumbers(int loc)
	{
		return lottoNumbers[loc];
	}
	
	void printTicket()
	{
		int k;
		System.out.print("Ticket numbers: ");
		for(k = 0; k < 6; k++)
		{
			if(k == 5)
			{
				System.out.println(lottoNumbers[k]);
			}
			else
			{
				System.out.print(lottoNumbers[k] + ", ");
			}
		}

	}

	void sortNumbers() 
	{
		Arrays.sort(lottoNumbers);		
	}

	void reset() 
	{
		int k;
		
		for(k = 0; k < 6; k++)
		{
			this.setLottoNumbers(k,0);
		}
		
	}
}
