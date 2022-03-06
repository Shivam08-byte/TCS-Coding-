

import java.util.*;
class PowerFourIfEquals{
public static void main(String args [])
{

	long n,x;
	n=3;
	x=(int)Math.pow(n,4);
	if(n<0)
	System.out.println("Invalid number ");
	else if(x%10==n)
			{System.out.println("true");}
		else 
			{System.out.println("false");}

	
}
}