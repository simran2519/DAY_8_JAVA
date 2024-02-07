//10.Program to calculate value of nCr using Recursion
//        Given two numbers N and r, find the value of NCr using recursion
//
//        Examples:
//
//        Input: N = 5, r = 2
//        Output: 10
//        Explanation: The value of 5C2 is 10
//
//        Input: N = 3, r = 1
//        Output: 3
package DAY_8.Assignment_1;

import java.util.Scanner;

public class Q10
{
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static int ncr(int n,int r)
    {
        int ans=fact(n)/(fact(n-r)*fact(r));
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        int n=sc.nextInt();
        int r= sc.nextInt();

        System.out.println(ncr(n,r));
    }
}
