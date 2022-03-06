import java.util.*;
class SumOfAllPossibleSubString
{
 public static void main(String args[])
 {
 	String str="1234";
        int cout=0;
        int sum=0;
        System.out.println("All possible sub strings are ");
        for(int i=0;i<str.length();i++)
            for(int j=i+1;j<=str.length();j++)
            {   cout++;
            	String s=str.substring(i,j);
            	sum=sum+Integer.parseInt(s);
                System.out.println(s);
            }

            System.out.println(cout+"  and sum is "+sum);
 }

}