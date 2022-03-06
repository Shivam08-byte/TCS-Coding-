import java.util.*;
class MultiplyAllDigitsOfN
{
	public static void main(String ... args )
	{
		int n=155527;
		System.out.print(multiplyAllDigitsOfN(n));
	}
	public static int multiplyAllDigitsOfN(int n)
	{	
		int lastDigit,res=1; 
		while(n!=0)
		{
			
			lastDigit=n%10;
			res=res*lastDigit;
			n=n/10;
		}
		return res;
	}
}