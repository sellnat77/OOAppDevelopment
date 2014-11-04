public class bubbleSortTester
{
	public static void main(String Theory[])
	{
		bubbleSorter bub = new bubbleSorter();

		bub.populateArray();
		System.out.println("The original Array");
		bub.print();
		bub.bSort();
		System.out.println("\n\n\n\n");
	}

}
