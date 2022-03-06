import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class CountOccurancdeOfSubstring
{
public static void main(String args[])
{
	String text="AABCCAAADCBBAADBBC";
	String str="AA";
	int count= countMatches(text,str);
	System.out.println(count);
}

public static boolean isEmpty(String s)
{
return s==null || s.length()==0;

}

public static int countMatches(String text,String str)
	{
		if(isEmpty(text)||isEmpty(str))
			{return 0;}
		//System.out.println("Method called");
		Pattern p=Pattern.compile(str);
		Matcher m=p.matcher(text);
		int count=0;
		while(m.find())
		{
			count++;
		}
		return count;
	}
}