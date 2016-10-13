package aevar.StringCalculator;

public class Calculator 
{
	public static int add(String number)
	{
		if(number.equals(""))
		{
			return 0;
		}
		else if (number.contains(","))
		{
			String[] numbers = number.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		}
		else
			return 1;
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}
}