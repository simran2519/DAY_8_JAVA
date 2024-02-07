//
//6.Problem statement
//        Write a recursive function that returns the sum of the digits of a given integer.
//
//        Sample Input 1 :
//        12345
//        Sample Output 1 :
//        15
//        Sample Input 2 :
//        9
//        Sample Output 2 :
//        9
package DAY_8.Assignment_1;

import java.util.Scanner;

public class Q6
{
    public static int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int sum=n%10+fun(n/10);
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(fun(n));
    }
}
