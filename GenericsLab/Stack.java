import java.util.*;

public class Stack <L>
{
   private ArrayList<L> myList;

   public Stack()
   {
      myList = new ArrayList<L>();
   }

   public void push(L item)
   {
      myList.add(item);
   }

   public L pop()
   {
      L retItem = null;
      if (!myList.isEmpty())
      {
         retItem = myList.remove(myList.size() - 1);
      }
      return retItem;
   }

   public boolean  empty()
   {
      return myList.isEmpty();
   }
}