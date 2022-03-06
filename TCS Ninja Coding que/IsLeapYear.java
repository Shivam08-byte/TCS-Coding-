import java.util.*;
class IsLeapYear{
	public static void main(String []args)
	{
		int year=2000;
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("Given Year = "+year+" is a leap year.");
		else
			System.out.println("Given Year = "+year+" is not leap year.");
	}
}