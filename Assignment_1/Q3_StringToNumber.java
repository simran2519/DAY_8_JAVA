package DAY_8.Assignment_1;

import java.util.Scanner;

public class Q3_StringToNumber
{
    public static int convertString(String s )
    {
        if(s.length()==1)
        {
            return s.charAt(0)-'0';
        }
        int ans =  convertString(s.substring(0, s.length()-1));
        int lastDigit = s.charAt(s.length()-1)-'0';
        return ans*10+lastDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        int num = convertString(str);
        System.out.println(num);
    }
}
