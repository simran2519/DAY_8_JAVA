//5.Problem statement
//        Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
//
//        a. The string begins with an 'a'
//        b. Each 'a' is followed by nothing or an 'a' or "bb"
//        c. Each "bb" is followed by nothing or an 'a'
//        If all the rules are followed by the given string, return true otherwise return false.
//
//        Sample Input 1 :
//        abb
//        Sample Output 1 :
//        true
//        Sample Input 2 :
//        abababa
//        Sample Output 2 :
//        false
//        Explanation for Sample Input 2
//        In the above example, a is not followed by either "a" or "bb", instead it's followed by "b" which results in false to be returned.

package DAY_8.Assignment_1;
import java.util.Scanner;
public class Q5
{
    public static boolean checkrules(String str)
    {
        // Base case= if the string is empty, return true
        if (str.isEmpty())
            return true;

        // Checks if the string begins with 'a'
        if (str.charAt(0) != 'a')
            return false;

        //  Checks if each 'a' is followed by nothing or an 'a' or "bb"
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            if (str.length() >= 3 && str.substring(1, 3).equals("bb"))
                return checkrules(str.substring(3)); // Move 3 characters ahead (skip "bb")
            else
                return checkrules(str.substring(1)); // Move 1 character ahead (skip 'b')
        } else {
            return checkrules(str.substring(1)); // Move 1 character ahead (skip 'a')
        }


    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(checkrules(str));

    }
}


