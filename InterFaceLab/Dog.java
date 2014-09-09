public class Dog implements speakable
{
   private String name;

   public Dog(String name)
   {
      this.name = name;
   }

   public void speak()
   {
     System.out.println("Woof! Woof!");
   }

   public String toString()
   {
      return "Dog:  " + name;
   }
}
