import java.util.*;

public class TreeSetRunner
{
	public static void main(String args[])
	{
		TreeSet<String> myTree = new TreeSet<String>();
		Iterator<String> itr = null;

		myTree.add("iii");
		myTree.add("hhh");
		myTree.add("ggg");
		myTree.add("fff");
		myTree.add("eee");
		myTree.add("ddd");

		myTree.add("ccc");
		myTree.add("bbb");
		myTree.add("aaa");
		myTree.add("iii");
		myTree.add("hhh");
		myTree.add("ggg");

		myTree.add("fff");
		myTree.add("eee");
		myTree.add("ddd");
		myTree.add("ccc");
		myTree.add("bbb");
		myTree.add("aaa");

		itr = myTree.iterator();
		for( String theTree: myTree)
		{
			System.out.println(itr.next());
		}
	}
}