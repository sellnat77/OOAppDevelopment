public class queueTester
{
	public static void main(String args[])
	{
		queueStore iphone = new queueStore();

		iphone.populateLine();

		iphone.checkFront();

		iphone.boredFriend();


		iphone.checkFront();

		iphone.checkoutGuests();


	}
}