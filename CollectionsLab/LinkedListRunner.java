import java.util.*;

public class LinkedListRunner
{
	public static void main(String args[])
	{
		LinkedList<String> myList = new LinkedList<String>();
		ListIterator<String> walker = null;

			myList.add("aaa");
			myList.add("bbb");
			myList.add("ccc");
			myList.add("ddd");
			myList.add("eee");
			myList.add("fff");
			myList.add("ggg");
			myList.add("hhh");
			myList.add("iii");

			walker = myList.listIterator();

			System.out.println("In order:");

			while(walker.hasNext())
			{
				System.out.println("\t"+walker.next());
			}

			System.out.println("In reverse order minus vowels:");

			while(walker.hasPrevious())
			{
				String checkedSt = walker.previous();
				char check = checkedSt.charAt(0);

				if(check == 'a'||check == 'e'||
				   check == 'i'||check == 'o'||
				   check == 'u')
				{
					walker.remove();
				}

				else
				{

					System.out.println("\t"+checkedSt);
				}
			}
		}
}