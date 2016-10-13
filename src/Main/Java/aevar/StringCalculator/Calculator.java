package aevar.StringCalculator;

public class Calculator 
{
	public static int add(String number)
	{
		if(number.equals(""))
		{
			return 0;
		}
		else if(number.contains(",") || number.contains("\n"))
		{
			return sum(split(number));
		}
		else
			return 1;
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	private static String[] split(String numbers)
	{

		return numbers.split("\\W+");
	}

	private static int sum(String[] numbers)
	{
		int total = 0;
		for(String number : numbers)
		{
			total = total + toInt(number);
		}
		return total;
	}
}