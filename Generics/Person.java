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

	public int getMeasure()
	{
		int measure = 0;

		measure = this.getAge();

		return measure;
	}

   public static <Person extends Measurable<Person>> Person max(ArrayList<Person> objects)
   {
      Person biggest = objects.get(0);
      for (int i = 1; i <objects.size(); i++)
      {
         Person obj = objects.get(i);
         if (obj.getMeasure()-biggest.getMeasure()>0)//(obj.compareTo(biggest) > 0)
         {
            biggest = obj;
         }
      }
      return biggest;
   }




}