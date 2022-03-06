import java.util.*;
class FibonacciSeries{
	public static void main(String args[])
	{
		int n=71;
		System.out.println("Fibonacci Series for given number n = "+n+" is :");
		FibonacciSeries(n);
	}//end of main
	public static void FibonacciSeries(int n)
	{
		int _1st=0,_2nd=1,_3rd;
		for(int i=1;i<n;i++)
		{
			System.out.print(_1st+" ");
			_3rd=_1st+_2nd;
			_1st=_2nd;
			_2nd=_3rd;
		}
	}
}