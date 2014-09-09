import java.util.*;

public class AnimalRunner
{
   public static void main(String[] args)
   {
      ArrayList<speakable> dogcatList = new ArrayList<speakable>();

      dogcatList.add(new Dog("Fred"));
      dogcatList.add(new Cat("Wanda"));

      for (speakable talk : dogcatList)
      {
         talk.speak();
      }
   }
}