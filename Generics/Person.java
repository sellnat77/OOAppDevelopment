/*
 * Name: Russell Tan
 * Date: October 11, 2014
 * Purpose: Create a class that extends measurable that is measurable and declares a unit of measure
 * Inputs: String name int age
 * Outputs: NA
 */
public class Person extends Measurable
{
	//Private members for age and name
	private int age;
	private String name;

	//Default constructor
	Person(){}
	//Full constructor
	Person(int A, String B)
	{
		age = A;
		name = B;
	}

	//Acessors for name and age
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	//Mutators for age and name
	public void setAge(int A)
	{
		age = A;
	}
	public void setName(String A)
	{
		name = A;
	}

	//Implementing the abstract get measure method from measurable and declaring the meausre of a person
	//to be based on their age
	public int getMeasure()
	{
		int measure = 0;

		measure = this.getAge();

		return measure;
	}
}