/*
 * Name   : Russell Tan
 * Date   : October 11, 2014
 * Purpose: Make the measurable interface into a generic class
 * Inputs : n/a
 * Output : The array list and the largest member of the array list
 */
import java.util.*;

public abstract class Measurable <T>
{

	private T t;

	//Abstract method to use later on in the person class
	abstract int getMeasure();

	//Static method to return the largest object of generic type T
   	public static <T extends Measurable<T>> T max(ArrayList<T> objects)
   	{
		//Largest element is achieved through a swap and compare algorithm
   	   	T biggest = objects.get(0);
   	   	for (int i = 1; i <objects.size(); i++)
   	   	{
   	   	   T obj = objects.get(i);
   	   	   //If the current obj is larger than the original largest obj
   	   	   //condition will be false and the original largest obj will
   	   	   //be swapped with the current obj
   	   	   if (obj.getMeasure()-biggest.getMeasure()>0)
   	   	   {
   	   	      biggest = obj;
   	   	   }
   	   	}
   	   	return biggest;
   	}
}