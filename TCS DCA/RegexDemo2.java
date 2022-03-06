import java.util.regex.Pattern;
import java.util.regex.Matcher;
class RegexDemo2
{
	public static void main(String ... args)
	{
		Pattern p=Pattern.compile("\\s");
		Matcher m=p.matcher("Shivam Malviya");
		while(m.find())
		{
			System.out.println("Found space at index : "+m.start());
		}
	}

}