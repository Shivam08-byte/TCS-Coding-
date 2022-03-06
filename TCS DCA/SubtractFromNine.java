import java.util.*;
/*
i/p 12345678
o/p 87654321

exp 9-1=8
*/

class SubtractFromNine
{
	public static void main(String args[])
	{
			Scanner sc =new Scanner(System.in);
			//String s="12345678";
			String s=sc.next();
			String res="";
			char ch;
			int n=0;
			for(int i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				String sn=Character.toString(ch);
				n=Integer.parseInt(sn);
				n=9-n;
				res=res+String.format("%d",n);
			}
			System.out.println(res);
	}

}