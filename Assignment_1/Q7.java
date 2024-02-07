//7.Problem statement
//        Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
//
//        Sample Input 1 :
//        3
//        5
//        Sample Output 1 :
//        15
//        Sample Input 2 :
//        4
//        0
//        Sample Output 2 :
//        0
package DAY_8.Assignment_1;

import java.util.Scanner;

public class Q7
{
    public static int fun(int n1,int n2)
    {
        if(n1==0) //base condition
        {
            return 0;
        }
        return n2+fun(n1-1,n2);     //suppose n1=3 and n2=5 then upto n1!=0 the recursion will go on and goes adding 5 again and again(3 times)
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 and 2");
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(fun(n1,n2));

    }

}
