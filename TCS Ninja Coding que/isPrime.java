/*WAP to check if the given number is prime number*/
import java.util.*;
class Isprime{
	public static void main(String args[])
	{
		int n=7;
		System.out.println("Given number n = "+n+" is prime true / false :"+isPrime(n));
	}//end of main

	public static boolean isPrime(int n)
	{	if(n==1)
			return false;
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}