package aevar.StringCalculator;

import java.util.*;
import java.io.*;

public class Calculator
{
	public static int add(String number)
	{
		if(number.equals(""))
		{
			return 0;
		}
		else if (number.contains("-"))
		{
			throw new IllegalArgumentException("Negatives not allowed: " + getNegative(number));
		}
		else if(number.contains(",") || number.contains("\n"))
		{
			return sum(splitt(number));
		}
		else
			return 1;
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	private static String[] splitt(String numbers)
	{
		numbers = numbers.replaceAll("[\\\n]", ",");
		return numbers.split(",");
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

	private static String getNegative(String number)
	{
		String empty = "";
		String[] split = splitt(number);
		for( String num : split ) {
			if (num.charAt(0) == '-')
				empty += num;
		}
		return empty;
	}
}
