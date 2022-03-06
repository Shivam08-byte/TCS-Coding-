import java.util.*;
class MultiepleOfGivenNumber{
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("PLz enter a number :");
	int a=sc.nextInt();
	sc.close();
	int i,j=0;
	int small[]=new int[10000];
	if(a<10)
	{
		System.out.println("1"+a);
		System.exit(0);
	}

	for(i=9;i>1;i--)
	{
		while(a%i==0)
		{
			a=a/i;
			small[j]=i;
			j++;
		}
	}

	if(a>10)
	{
		System.out.println("Not possible !!!!!!!!!!!!");
	}
	for(i=j-1;i>=0;i--)
	{
		System.out.print(small[i]);
	}
}
}