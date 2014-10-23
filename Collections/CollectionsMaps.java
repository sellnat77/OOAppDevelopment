import java.util.*;
import java.io.*;

public class CollectionsMaps
{
	private String text;
	private Map<Character, Integer> scrabble = new HashMap<Character, Integer>();
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
			int pPoint;


			while(pointsIn.hasNext())//While there exists text in the file
			{
				text = pointsIn.nextLine();

				pChar = text.charAt(0);
				pPoint = Integer.parseInt(text.substring(1));

				scrabble.put(pChar,pPoint);


			}

			System.out.println(scrabble.get('z'));

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}