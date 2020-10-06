package cse360assignment02;

public class AddingMachine 
{
	//declear class variables
	private int total;
	private String outputString;
	//Constructor
	public AddingMachine()
	{
		total = 0;	
		outputString = "0";
	}
	//Getter method to get total amount. Return an integer.
	public int getTotal()
	{
		return total;
	}
	//A method to add. It takes an integer and update the output string.
	public void add(int value)
	{
		total += value;
		outputString = outputString + " + " + value;
	}
	//A method to subtract. It takes an integer and update the output string.
	public void subtract(int value)
	{
		total -= value;
		outputString = outputString + " - " + value;
	}
	//toString method to creating a string. It returns the final output string.
	public String toString()
	{
		return outputString;
	}
	//a method to clear. To clear the outputStrign and total.
	public void clear()
	{
		outputString = "0";
		total = 0; 
	} 

}
