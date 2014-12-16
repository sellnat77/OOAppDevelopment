import java.util.*;
import java.io.*;

public class WordCount
{
	public static void main(String args[])
	{
		String zipPath,scrabblePath,regexPath;
		Scanner userIn = new Scanner(System.in);

		System.out.println("Please enter the ziptable.txt path");
		zipPath = userIn.nextLine();

		System.out.println("Please enter the scrabble.txt path");
		scrabblePath = userIn.nextLine();

		System.out.println("Please enter the RegexTestHarness.java path");
		regexPath = userIn.nextLine();
		System.out.println("\n\n\n");

		fileThread zips = new fileThread(zipPath);
		fileThread scrab = new fileThread(scrabblePath);
		fileThread regex = new fileThread(regexPath);

		Thread z = new Thread(zips);
		Thread s = new Thread(scrab);
		Thread r = new Thread(regex);

		z.start();
		s.start();
		r.start();



	}

}