//
//Write a recursive method factorial(int n) that returns the factorial of n. The factorial of n is n * (n-1) * (n-2) *
// ... * 1. The factorial of 0 is defined as 1.
package DAY_8.Assignment_1;
import java.util.Scanner;
public class Q1_Factorial
{
    public static int factorial(int n)
    {
        if(n==0 || n==1)         //base condition
        {
            return 1;
        }
        int ans=n*factorial(n-1);        //fac(n)=n*(n-1)*(n-2)...
        return ans;        //or can directly    return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. whose factorial you want to find");
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
    }
}
