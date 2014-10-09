import java.util.*;

/**
   Describes any class whose objects can be measured.
*/
public class Measurable <T>
{
	private T t;
	private ArrayList<T> items = new ArrayList<T>();

	public void add(T t)
	{
		items.add(t);
	}

	public T get(int loc)
	{
		return items.get(loc);
	}


   /**
      Computes the measure of the object.
      @return the measure
   */

   public static <T extends Comparable<T>> T max(ArrayList<T> objects)
   {
      T biggest = objects.get(0);
      for (int i = 1; i <objects.size(); i++)
      {
         T obj = objects.get(i);
         if (obj.compareTo(biggest) > 0)
         {
            biggest = obj;
         }
      }
      return biggest;
   }

   public void print( ArrayList<T> input)
   {
	   for ( T element : input ){
	               System.out.printf( "%s ", element );
	            }
         System.out.println();
   }

}