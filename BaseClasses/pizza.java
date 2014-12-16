import java.util.*;
import java.io.*;

public class pizza implements Serializable
{
	private ArrayList<String> toppings = new ArrayList<String>();
	private char size;
	private String sauce;
	private String crust;

	public pizza()
	{
		size = 'L';
		sauce = "Marinara";
		crust = "Pan";
		toppings.add("Cheese");
	}

	public pizza(char si, String sa, String cr)
	{
		size = si;
		sauce = sa;
		crust = cr;
		toppings.add("Cheese");
	}

	public void addToppings(String top)
	{
		toppings.add(top);
	}
	public void setSize(char s)
	{
		size = s;
	}
	public void setCrust(String c)
	{
		crust = c;
	}

	public ArrayList<String> getToppings()
	{
		return toppings;
	}

	public char getSize()
	{
		return size;
	}
	public String getSauce()
	{
		return sauce;
	}
	public String getCrust()
	{
		return crust;
	}

	public String toString()
	{
		return ("This is a " + getSize() + " " + getToppings() + " with " + getSauce() + " sauce and " + getCrust() + " crust.");
	}

}