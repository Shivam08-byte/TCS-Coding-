
import java.util.*;
class ArmstrongSum
{
	public static void main(String args[])
	{
		
		for(int i=1;i<1000;i++)
		{
			boolean b=isArmstrong(i);
			if(b==true)
				System.out.print(i+", ");
		}
	
	}

	public static boolean isArmstrong(int n)
	{	//to extract power
		String str=Integer.toString(n);
		int power = str.length();
		


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