//Write a recursive method fibonacci(int n) that returns the nth number in the Fibonacci sequence.
// The Fibonacci sequence is defined as follows: fib(0) = 0, fib(1) = 1, and fib(n) = fib(n-1) + fib(n-2) for n > 1.
package DAY_8.Assignment_1;
import java.util.Scanner;
public class Q2_Fibonacci
{
    public static int fib(int n)
    {
        //BASE CONDITION------------
        if(n==1)        //The 1st term is 0 2nd term is 1 like this   0 1 1 2 3 5 8 13 (0 is the 1st term)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }

        //if(n==0)   //this condition is if 0 is the zeroth term  0 1 1 2 3 (Here 0 is oth term and 1 is 1st term)
//        {
//            return 0;
//        }
//        if(n==1)
//        {
//            return 1;
//        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. whose factorial you want to find");
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
