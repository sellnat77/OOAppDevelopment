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

	abstract int getMeasure();

   public static <T extends Measurable<T>> T max(ArrayList<T> objects)
   {
      T biggest = objects.get(0);
      for (int i = 1; i <objects.size(); i++)
      {
         T obj = objects.get(i);
         if (obj.getMeasure()-biggest.getMeasure()>0)//(obj.compareTo(biggest) > 0)
         {
            biggest = obj;
         }
      }
      return biggest;
   }

   public void print( ArrayList<T> input)
   {
	   for ( T element : input )
	   {
	   		System.out.printf( "\t%s ", element );
	   }
       System.out.println();
   }

}