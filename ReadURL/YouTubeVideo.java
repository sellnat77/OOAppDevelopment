import java.net.*;
import java.awt.Desktop;



public class YouTubeVideo {
	public static void main (String args[]) throws Exception
	{
	 	URI oracle = new URI("https://www.youtube.com/");
	    Desktop.getDesktop().browse(oracle);
 	}
}