import java.util.regex.Pattern;
import java.util.regex.Matcher;
class RegexDemo1
{
	public static void main(String ... args)
	{
		Pattern p=Pattern.compile("a");
		Matcher m=p.matcher("Shivam Malviya");
		while(m.find())
		{
			System.out.println("Found a at index : "+m.start());
		}
	}

}