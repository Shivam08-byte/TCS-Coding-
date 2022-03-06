import java.util.*;
class IsPalindrome{
	public static void main(String args[])
	{
		int n=343;
		//String str=Integer.toString(n);
		System.out.println("Given String str = "+str+" is IsPalindrome true / false :"+isPalindrome(Integer.toString(n)));
	}//end of main

	public static boolean isPalindrome(String str)
	{
		StringBuilder sb=new StringBuilder(str).reverse();
		return str.equals(sb.toString());
	}
}