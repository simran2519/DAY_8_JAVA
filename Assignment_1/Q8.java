//8.Problem statement
//        Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
//
//        Sample Input 1 :
//        0
//        Sample Output 1 :
//        1
//        Sample Input 2 :
//        00010204
//        Sample Output 2 :
//        2
//        Explanation for Sample Output 2 :
//        Even though "00010204" has 5 zeros, the output would still be 2 because when you convert it to an integer, it becomes 10204.
//        Sample Input 3 :
//        708000
//        Sample Output 3 :
//        4
package DAY_8.Assignment_1;

import java.util.Scanner;

public class Q8
{
    public static int fun(int n)
    {                  // 456
        if(n==0)
        {
            return 0;
        }
        if(n%10==0)
        {
            return (1+fun(n/10));
        }
        else
        {
            return fun(n/10);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number no. n");
        int n= sc.nextInt();
        System.out.println(fun(n));

    }
}
