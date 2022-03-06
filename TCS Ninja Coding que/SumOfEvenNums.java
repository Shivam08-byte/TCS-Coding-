import java.util.*;
class SumOfEvenNums
{
	public static void main(String args[])
	{
		int n1=401,n2=901,sum=0;
		for(int i=401;i<901;i++)
		{
			boolean b=isEven(i);
			if(b==true)
				sum+=i;
		}
	System.out.println(sum);
	}
	public static boolean isEven(int n)
	{
		if(n%2==0)
			return true;
		else 
			return false;
	}
}