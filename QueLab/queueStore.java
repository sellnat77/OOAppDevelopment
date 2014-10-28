/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This class adds items to a queue then removes the items in the order of FIFO
 */



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueStore
{
	private Scanner userInput = new Scanner(System.in);
	Queue<String> storeOne = new LinkedList<String>();
	Queue<String> storeTwo = new LinkedList<String>();
	private int peopleToAdd;
	private int peopleRemoved = 0;

	public void setPeopleToAdd(int A)
	{
		peopleToAdd = A;
	}
	public int getPeopleToAdd()
	{
		return peopleToAdd;
	}

	public void populateLine()
	{
		int k;
		System.out.println("Please enter how many people to add to the line.");
		this.setPeopleToAdd(userInput.nextInt());
		userInput.nextLine();

		for(k = 0; k < this.getPeopleToAdd(); k++)
		{
			System.out.println("Please enter a person to add to the line.");
			storeOne.add(userInput.nextLine());
		}
		System.out.println("\n\tThe line for the store is: [front,...,back]"+storeOne.toString());
		System.out.println("The size of the line is: " + storeOne.size()+"\n");
	}

	public void checkFront()
	{
		System.out.println("The person at the front of the line is: " + storeOne.peek());
	}

	public void checkoutGuests()
	{
		int k,m;

		System.out.println("\n\tThe line for the store is: [front,...,back]"+storeOne.toString());
		for(k = 0; k < storeOne.size()+1; k++)
		{
			System.out.println("\nThe size of the line is: " + storeOne.size());
			System.out.println("\n"+storeOne.remove()+" has checked out.");
			System.out.println("\nThe line for the store is: [front,...,back]"+storeOne.toString());
			System.out.println("\nPress any key to move to next customer.");
			userInput.nextLine();
		}
		System.out.println(storeOne.remove()+" has checked out.");


	}

	public void boredFriend()
	{
		System.out.println("\nWho got bored?");
		String friend = userInput.nextLine();

		storeOne.remove(friend);
		System.out.println(friend + " got bored and left.\n\n");

		peopleRemoved++;

	}

}