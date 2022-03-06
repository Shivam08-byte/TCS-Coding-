import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Remove7And56fromString
{
	public static void main(String args[])
	{
		String s="A56gar7a";
		StringBuilder sb=new StringBuilder(s);
		int i=giveIndex("7",s);
		
		if(i!=0)
			sb=sb.deleteCharAt(i);
		i= giveIndex("56",s);
		
		if(i!=0)
			{
				sb=sb.deleteCharAt(i); 
				sb=sb.deleteCharAt(i);
			}
		
		System.out.println(sb.toString());
	}

	public static int giveIndex(String pattern,String target)
	{
		//System.out.println("Method called");
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(target);
		while(m.find())
		{
			return m.start();
		}
		return -1;
	}


}