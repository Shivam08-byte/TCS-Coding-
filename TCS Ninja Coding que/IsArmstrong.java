/*
Armstrong number :
sum of power of digits = number ; where power = no. of digits in given number
Example : 153= 1^3 + 5^3 + 3^3

Steps : 
1. Count the digits = power
2. Split the digit
3. use power function
*/

import java.util.*;
class IsArmstrong{
	public static void main(String args[])
	{
		int n=153;
		
		System.out.println("Given String str = "+n+" is Armstrong true / false :"+isArmstrong(n));
	}//end of main

	public static boolean isArmstrong(int n)
	{	//to extract power
		String str=Integer.toString(n);
		int power = str.length();
		/* alternative of above 2 lines 
		   int power=0;
		   while(n!=0)
		   {
			n=n/10;
			power++;
		   }
		*/


		double N=n;
		double powerSum=0;
		int lastDigit=0;

		while(n!=0)
		{
			lastDigit=n%10;
			powerSum += Math.pow(lastDigit,power);
			n=n/10;
		}
		if(powerSum==N)
			return true;

		return false;
	}
}