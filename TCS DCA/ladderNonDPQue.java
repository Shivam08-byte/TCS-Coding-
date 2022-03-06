import java.util.*;
class ladderNonDPQue{
public static void main(String args [])
{

	int arr[]={1,3,5,3,8,2,6,7,6,8,9};
	int step=1,hops=0;
	for(int j=0;j<11;j++)
	{
		if(step<11)
		{
			step=step+arr[step-1];
			hops++;

		}
	}
	System.out.println(hops);
	
}
}