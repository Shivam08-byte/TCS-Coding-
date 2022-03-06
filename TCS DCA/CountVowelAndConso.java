/*
In the main method, read a String (which may have alphabets along with numeric digits) and print the number of vowel and consonants (any alphabet apart from vowel is a consonant) present in the given String.
Note: The output should be printed in the same format as mentioned in the sample output.

Consider below sample input and output:

Input:
Welcome123

Output:
Number of Vowels: 3
Number of Consonants: 4

*/


import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

class CountVowelAndConso
{
public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
    String s=sc.next();
    //StringBuilder sb=new StringBuilder(str);
    
   /* 
    int ind=0;
    for(int i=0;i<sb.length();i++)
    {
     ind=giveIndex("[0-9]",sb.toString());
      if(ind>=0)
      sb=sb.deleteCharAt(i);
    }
    */
    s=s.toLowerCase();
   // System.out.println(s);
    int vCount=giveCount("[aeiou]",s);
    int cCount=giveCount("[a-z]",s);
    
    System.out.println("Number of Vowels: "+vCount);
    System.out.println("Number of Consonants: "+(cCount-vCount));
    
    
    
  
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
     public static int giveCount(String pattern,String target)
	{
		//System.out.println("Method called");
       int count=0;
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(target);
		while(m.find())
		{
			count++;
		}
		return count;
	}


}



//code by gfg
/*
import java.util.*;

public class MyClass
{
  public static void main(String []args)
  {
    int vCount = 0, cCount = 0;    
            
        //Declare a string    
        Scanner sc=new Scanner(System.in);
        String str=sc.next();    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("Number of Vowels: " + vCount);    
        System.out.println("Number of Consonants: " + cCount);    
    } 
}

*/