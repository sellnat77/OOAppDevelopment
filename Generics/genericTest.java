import java.util.*;

public class genericTest
{
	public static void main(String theory[])
	{
		ArrayList<Integer> iValues = new ArrayList<Integer>();
		ArrayList<String> sValues = new ArrayList<String>();
		ArrayList<Double> dValues = new ArrayList<Double>();
		ArrayList<Character> cValues = new ArrayList<Character>();
		Measurable result = new Measurable();

		//ArrayList<String> intValues = new ArrayList<Integer>();
		//Measurable<String> intResult = new Measurable<Integer>();


		iValues.add(9);
		iValues.add(20);
		iValues.add(4);
		iValues.add(6);
		sValues.add("alphabet");
		sValues.add("string");
		sValues.add("LOL");
		sValues.add("Caribou");
		dValues.add(3.7);
		dValues.add(9.1);
		dValues.add(48.7);
		dValues.add(6007.324);
		cValues.add('a');
		cValues.add('t');
		cValues.add('r');
		cValues.add('g');


		result.print(iValues);
		result.print(sValues);
		result.print(dValues);
		result.print(cValues);
		System.out.println("MAX " + result.max(iValues));
		System.out.println("MAX " + result.max(sValues));
		System.out.println("MAX " + result.max(dValues));
		System.out.println("MAX " + result.max(cValues));

	}
}