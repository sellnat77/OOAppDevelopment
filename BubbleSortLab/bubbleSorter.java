public class bubbleSorter
{
	private int arToSort[] = new int[20];

	public bubbleSorter(){}

	public void populateArray()
	{
		for(int k = 0; k < arToSort.length; k++)
		{
			arToSort[k] = (int)( Math.random()*1000 % 1000);
		}
	}

	public void bSort()
	{
		int temp;
		boolean swap = false;
		for(int j = arToSort.length; j > 0; j--)
		{	swap = false;
			for(int k = arToSort.length-1; k > 0; k--)
			{
				if(arToSort[k] < arToSort[k-1])
				{
					temp          = arToSort[k];
					arToSort[k]   = arToSort[k-1];
					arToSort[k-1] = temp;

					swap          = true;
				}
			}
			if(!swap)
			{
				break;
			}
			System.out.println("\n\nAfter run "+(1+(arToSort.length-j)));
			this.print();
		}
	}
	public void print()
	{
		int k;
		for(k = 0; k <arToSort.length; k++)
		{
			if(k == arToSort.length-1)
			{
				System.out.format(arToSort[k]+"");
			}
			else
			{
				System.out.format(arToSort[k]+",");
			}
		}
		System.out.println("");
	}
}

