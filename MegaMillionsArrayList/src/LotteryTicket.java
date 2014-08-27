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
		System.out.print("\nTicket numbers: ");
		for(k = 0; k < 6; k++)
		{
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

	void sortNumbers() 
	{
		Arrays.sort(lottoNumbers);		
	}

	void removeDuplicates()
	{
		int k;
		boolean isDuplicate = true;
		
		while(isDuplicate)
		{
			for( k = 1; k < lottoNumbers.length; k++)
			{
				isDuplicate = true;
				if(lottoNumbers[k-1] == lottoNumbers[k])
				{
					System.out.println("FOUND AT " + (k-1) + "original number was" + lottoNumbers[k-1]);
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
