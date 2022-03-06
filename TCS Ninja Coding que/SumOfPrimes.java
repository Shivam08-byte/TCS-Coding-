
import java.util.*;
class SumOfPrimes
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=100;i<600;i++)
		{// Java program to find LCM of two numbers.
class Test
{
	// Recursive method to return gcd of a and b
	static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	
	// method to return LCM of two numbers
	static int lcm(int a, int b)
	{
		return (a / gcd(a, b)) * b;
	}
	
	// Driver method
	public static void main(String[] args)
	{
		int a = 15, b = 20;
		System.out.println("LCM of " + a +
						" and " + b +
					" is " + lcm(a, b));
	}
}

			boolean b=isPrime(i);
			if(b==false)
				sum+=i;
		}
	System.out.println(sum);
	}

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