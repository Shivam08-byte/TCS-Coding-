/*
Q. WAP to check if given number if perfect number?
 perfect number :
 			Sum of proper divisior is equal to the number
 			example: let number = 6 now it is perfect no. becouse 1+2+3=6
 				     means 1,2,3 are its factors excluding number itself have there sum = 6

*/
import java.util.*;
class IsPerfectNumber{
	public static void main(String args[])
	{
		int n=6;
		System.out.println("Given number n = "+n+" is perfect number true / false :"+isPerfectNumber(n));
	}//end of main

	public static boolean isPerfectNumber(int n)
	{	int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			return true;
		return false;
	}
}