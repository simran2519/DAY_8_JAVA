//4.Problem statement
//        Given a string S, compute recursively a new string where identical chars that are adjacent in the original
//        string are separated from each other by a "*".
//        Sample Input 1 :
//        hello
//        Sample Output 1:
//        hel*lo
//        Sample Input 2 :
//        aaaa
//        Sample Output 2 :
//        a*a*a*a
package DAY_8.Assignment_1;
import java.util.Scanner;
public class Q4
{
    public static String fun(String str)
    {
        if(str.length()==1)
        {
            return str;
        }
        if(str.charAt(0)==str.charAt(1))
        {
            return str.charAt(0)+"*"+fun(str.substring(1));
        }
        else
        {
            return str.charAt(0) + fun(str.substring(1));
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        System.out.println(fun(str));
    }
}
