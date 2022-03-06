

import java.util.*;
class SumOfOdds
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=300;i<800;i++)
		{
			boolean b=isEven(i);
			if(b==false)
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