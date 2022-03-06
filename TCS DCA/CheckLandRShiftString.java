/*
Check if left and right shift of any string results into given string
nput: S = “abcd” 
Output: No 
Explanation: 
There is no string which have left shift and right shift both equal to string “abcd”.

Input: papa 
Output: Yes 
Explanation: 
The left shift and right shift both of string “apap” equals to string “papa”. 

*/




class CheckLandRShiftString
{
public static void check_string_exist(String S)
{
    int size = S.length();
    boolean check = true;
     
    for(int i = 0; i < size; i++)
    {
        
       // Check if any character
       // at position i and i+2
       // are not equal
       // then string doesnot exist
       if (S.charAt(i) != S.charAt((i + 2) % size))
       {
           check = false;
           break;
       }
    }
     
    if (check)
        System.out.println("Yes");
    else
        System.out.println("No");
}
 
// Driver Code
public static void main(String[] args)
{
    String S = "papa";
     
    check_string_exist(S);
}


}