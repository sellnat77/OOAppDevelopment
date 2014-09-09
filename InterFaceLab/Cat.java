public class Cat implements speakable
{
   private String name;

   public Cat(String name)
   {
      this.name = name;
   }

   public void speak()
   {
     System.out.println("Meow! Meow!");
   }

   public String toString()
   {
      return "Cat:  " + name;
   }
}