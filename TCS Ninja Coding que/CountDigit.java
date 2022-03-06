/*
WAP to count digit of given number
*/
class CountDigit{
	public static void main(String args[])
	{
		int n=146;
		System.out.println("Digits in "+n+" is : "+countDigit(n));
		
	}//end of main 

	public static int countDigit(int n)
	{
		int lastDigit,count=0; 
		while(n!=0)
		{
			
			lastDigit=n%10;
			count++;
			n=n/10;
		}
		return count;
	}

}