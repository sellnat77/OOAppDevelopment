public class bubbleSorter
{
	int arToSort[] = new int[50];

	bubbleSorter(){}

	public void populateArray()
	{
		int k;

		for(k = 0; k < arToSort.length; k++)
		{
			arToSort[k] = (int)( Math.random()*1000 % 1000);
			
		}
	}

	public void bSort()
	{
		int k,temp;
		boolean sorted = false;
		while(!sorted)
		{
			sorted = false;
			for(k = arToSort.length-1; k > 0; k--)
			{
				if(arToSort[k]> arToSort[k-1])
				{
					temp = arToSort[k];
					arToSort[k] = arToSort[k-1];
					arToSort[k-1] = temp;
					sorted = true;
				}	
			}		
		}		
	}

	public void print()
	{
		int k;
		for(k = 0; k <arToSort.length; k++)
		{
			System.out.format(arToSort[k]+",");
		}
		System.out.println("");
	}


}

