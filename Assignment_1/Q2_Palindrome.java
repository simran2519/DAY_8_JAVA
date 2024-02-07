//2.Problem statement
//        Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.
//
//        Note: You are not required to print anything, just implement the function. Example:
//        Input: s = "racecar"
//        Output: true
//        Explanation: "racecar" is a palindrome.
//
//        Sample Input 1:
//        abbba
//        Sample Output 1:
//        true
//        Explanation Of Sample Input 1 :
//        “abbba” is a palindrome
//        Sample Input 2:
//        abcd
//        Sample Output 2:
//        false
//        Explanation Of Sample Input 2 :
//        “abcd” is not a palindrome.
//        Constraints:
//        0 <= |S| <= 10^6
//        where |S| represents the length of string S.

        package DAY_8.Assignment_1;

import java.util.Scanner;

public class Q2_Palindrome
{
    public static boolean isPalindrome(String str,int left,int right)
    {
        if(left>=right)
        {
            return true;
        }
        if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
        //else if(str.charAt(left)==str.charAt(right))
            return isPalindrome(str,left+1,right-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        int n=str.length()-1;
        int left=0;
        int right=str.length()-1;
        System.out.println(isPalindrome(str,left,right));
    }
}
