
import java.util.*;
class DecimalToBinaryAndViseVersa{
	public static void main(String []args)
	{
		int n=45;
		System.out.println("Decimal to Binary conversion of "+n+" is : "+decimalToBinary(n));
		int n1=101101;
		System.out.println("Binary to Decimal conversion of "+n1+" is : "+binaryToDecimal(n1));
	}//end of main

	public static int binaryToDecimal(int n)
	{
		int num=n;
		int decimal=0;
		int base =1;
		int temp=num;
		while(temp>0)
		{
			int lastDigit=temp%10;
			temp=temp/10;
			decimal=decimal+lastDigit*base;
			base=base*2;

		}
		return decimal;
	}
	public static int decimalToBinary(int n)
	{
		int binary=0,i=1,remainder;
		while(n!=0)
		{
			remainder=n%2;
			n=n/2;
			binary=binary+remainder*i;
			i=i*10;
		}
		return binary;
	}
}	