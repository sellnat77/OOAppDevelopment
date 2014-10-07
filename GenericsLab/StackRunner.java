public class StackRunner
{
   public static void main(String[] args)
   {
      Stack stk1 = new Stack();
      stk1.push(1);
      stk1.push(2);
      stk1.push(3);
      stk1.push(4);
	  stk1.push('a');
	  stk1.push('b');
	  stk1.push('c');
      stk1.push('d');
      while (!stk1.empty())
      {
         System.out.println(stk1.pop());
      }
   }
}