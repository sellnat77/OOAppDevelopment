import java.util.*;

/**
   Describes any class whose objects can be measured.
*/
public class Measurable <Item>
{
	ArrayList<Item> measurableItems = new ArrayList<Item>();
   /**
      Computes the measure of the object.
      @return the measure
   */
   public static Item largestElement()
   {
	   Collections.sort(measurableItems);
	   return measurableItems.get(0);
   }
}