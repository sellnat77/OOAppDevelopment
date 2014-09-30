/*
 * Name   : Russell Tan
 * Date   : September 23, 2014
 * Purpose: Utilize miniwpi interface to create a mini word processor
 * Inputs :
 * Outputs:
 */

public class miniWord implements MiniWPI
{

	  /** Is cursor at the start of the text? */
	  public boolean isAtStart()
	  {
		  boolean start = false;
		  if(left.empty())
		  {
			  start = true;
		  }
		  return start;
	  }
	  /** Is cursor at the end of the text? */
	  public boolean isAtEnd()
	  {
		  boolean end = false;
		  if(right.empty())
		  {
			  end = true;
		  }
		  return end;
	  }
	  /** Insert c into the string at the cursor. */
	  public void insertChar(char c)
	  {
		  left.push(c);
	  }
	  /** Move cursor left 1 character.  If we're already at the
	   * start of the string, do nothing.
	   */
	  public void moveLeft()
	  {
		  if(!isAtStart())
		  {
			right.push(left.pop());
		  }
	  }
	  /** Move cursor right 1 character.  If we're already at the
	   * end of the string, do nothing.
	   */
	  public void moveRight()
	  {
		  if(!isAtEnd())
		  {
			  left.push(right.pop());
		  }
	  }
	  /** Delete character before the cursor.  If there is none,
	   * do nothing. */
	  public void backspace()
	  {
		  if(left.peek() != null)
		  {
			  left.pop();
		  }
	  }
	  /** Delete character after the cursor.  If there is none,
	   * do nothing. */
	  public void delete()
	  {
		  if(right.peek() != null)
		  {
			  right.pop();
		  }
	  }
	  /** Move cursor to start of the text. */
	  public void moveToStart()
	  {
		  while(!isAtStart())
		  {
			  right.push(left.pop());
		  }
	  }
	  /** Move cursor to end of the text. */
	  public void moveToEnd()
	  {
		  while(!isAtEnd())
		  {
		  	left.push(right.pop());
		  }
	  }
	  /** Convert to string.  The cursor position is ignored.
	   * @see toStringCursor
	   */
	  public String toString()
	  {
		  String word = "";

		  this.moveToStart();
		  while(!isAtEnd())
		  {
			  word += right.pop();
		  }
		  return word;
	  }
	  /** Like toString, but the special character | is included
	   * to mark the cursor position.
	   */
	  public String toStringCursor()
	  {
		  String temp = "";

		  while(!left.empty())
		  {
			  temp += left.pop();
		  }
		  temp = this.reverseString(temp);
		  temp += '|';
		  while(!right.empty())
		  {
			  temp += right.pop();
		  }

		  return temp;
	  }
	  /** Search forward for the next occurrence of c that starts at the
	   * cursor or later.  If found, leave the cursor immediately after
	   * that occurrence and return true.  Else, leave the cursor at the
	   * end of the text and return false. */
	  public boolean search(char c)
	  {
		  boolean found = false;

		  while(!isAtEnd())
		  {
			  if(right.peek() == c)
			  {
				  left.push(right.pop());
				  found = true;
			  }
			  else
			  {
				  left.push(right.pop());
			  }
		  }

		  return found;
	  }


	/** Method that reads in the string that was retrieved from the top of the Queue and
	 *  executes the appropriate command. It also calls a method to print out the command
	 *  just executed and the resulting stacks
	 */
	  public void processCommand(String s)
	  {

	  }
	  /* Method to print out a command and the results */
	  public void printtest(String s)
	  {
	  }

	  public String reverseString(String data)
	  {
		  int i = data.length();
		  String temp = "";

		  for (i = data.length()-1; i > 0; i--)
		  {
			  temp += data.charAt(i);
		  }

		  return temp;
	  }
}