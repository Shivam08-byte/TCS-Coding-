/*
Strong Number :
Sum of Factorial of digit = number 
*/
class IsStrongNumber{
	public static void main(String args[])
	{
		int n=145;
		System.out.println("Given number "+n+" is StrongNumber true/false : "+isStrongNumber(n));
		// System.out.println(factorial(n));
	}//end of main


	public static boolean isStrongNumber(int n)
	{
		int lastDigit,originalNumber=n,factorialSum=0;
		while(n!=0)
		{
			lastDigit=n%10;
			factorialSum=factorialSum+factorial(lastDigit);
			n=n/10;
		}
		if(factorialSum==originalNumber)
			return true;

		return false;

	}

	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;

		return fact;
	}
}