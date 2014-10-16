import java.util.*;

public class Person extends Measurable
{
	private int age;
	private String name;

	Person(){}
	Person(int A, String B)
	{
		age = A;
		name = B;
	}

	public int getAge()
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public int getMeasure()
	{
		int measure = 0;

		measure = this.getAge();

		return measure;
	}
}