//1.Problem statement
//        Given k, find the geometric sum i.e.
//        1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
//        Note :
//        using recursion.
//        Sample Input 1 :
//        3
//        Sample Output 1 :
//        1.87500
//        Sample Input 2 :
//        4
//        Sample Output 2 :
//        1.93750
//        Explanation for Sample Input 1:
//        1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.87500
package DAY_8.Assignment_1;

import java.util.Scanner;

public class Q1_GP
{
    public static int pow(int p)   //to find pow
    {
        if(p==0)   //Base
        {
            return 1;
        }
        return 2*pow(p-1);
    }
    public static double gp(int n)   //to find the gp sum
    {
        if(n==0)
        {
            return 1;
        }
        return 1.0/  pow(n)+gp(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. whose factorial you want to find");
        int n=sc.nextInt();
        System.out.println(gp(n));
    }
}
