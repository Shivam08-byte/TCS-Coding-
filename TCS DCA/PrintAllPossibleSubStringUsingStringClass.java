import java.util.*;
class PrintAllPossibleSubStringUsingStringClass
{
    public static void main(String args[])
    {
        String str="abbc";
        int cout=0;
        System.out.println("All possible sub strings are ");
        for(int i=0;i<str.length();i++)
            for(int j=i+1;j<=str.length();j++)
            {   cout++;
                System.out.println(str.substring(i,j));
            }

            System.out.println(cout);
    }
}