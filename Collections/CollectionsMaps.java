/*
 * Name: Russell Tan
 * Date: October 26, 2014
 * Purpose: Determine pont values of scrabble words and analyze time difference between
 *          Tree and hash set assignments
 * Inputs: QNoU.txt points.txt
 * Outputs: Point values of words and time taken by a large tree and hash set assignment
 */
import java.util.*;
import java.io.*;

public class CollectionsMaps
{
	private String text;
	private Map<Character, Integer> scrabble = new HashMap<Character, Integer>();
	private TreeSet<String> books = new TreeSet<String>();
	private HashSet<String> textBook = new HashSet<String>();
	CollectionsMaps(){}

	public void readScabble()
	{
		try
		{

			File scrab = new File("QNoU.txt");
			File points = new File("points.txt");
			Scanner input = new Scanner(scrab);
			Scanner pointsIn = new Scanner(points);
			char pChar;
			int pPoint,total;


			while(pointsIn.hasNext())//While there exists text in the file
			{
				text = pointsIn.nextLine();
				pChar = text.charAt(0);
				pPoint = Integer.parseInt(text.substring(1));
				scrabble.put(pChar,pPoint);
			}

			while(input.hasNext())
			{
				total = 0;
				text = input.nextLine();

				for(int k = 0; k < text.length(); k++)
				{
					System.out.printf("%s = %2d points\n",text.charAt(k),scrabble.get(text.charAt(k)));
					total+= scrabble.get(text.charAt(k));
				}
				System.out.println("\nWord: " +text+ " Total: " + total + "\n\n");

			}

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

	public void largeSets()
	{
		Date today = new Date();
		long time1, time2;

		try
		{
			File war = new File("warpeace.txt");
			Scanner gun = new Scanner(war);
			Scanner secGun = new Scanner(war);
			time1=System.currentTimeMillis();
			while(gun.hasNext())
			{
				books.add(gun.next());
			}
			time2=System.currentTimeMillis();
			System.out.println("Time for the tree operation is: " + (time2-time1));

			time1=System.currentTimeMillis();
			while(secGun.hasNext())
			{
				textBook.add(secGun.next());
			}
			time2=System.currentTimeMillis();
			System.out.println("Time for the hash operation is: " + (time2-time1));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}