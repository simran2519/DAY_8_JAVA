//13.Find the value of a number raised to its reverse
//        Given a number N and its reverse R. The task is to find the number obtained when the number is raised to the power of its own reverse. The answer can be very large, return the result modulo 109+7.
//
//        Examples:
//        Input : N = 2, R = 2
//        Output: 4
//        Explanation: Number 2 raised to the power of its reverse 2 gives 4 which gives 4 as a result after performing modulo 109+7
//
//        Input : N = 57, R = 75
//        Output: 262042770
//        Explanation: 5775 modulo 109+7 gives us the result as 262042770
package DAY_8.Assignment_1;
import java.util.Scanner;
public class Q13
{
    public static long fun(int n,int r)
    {
        if(n==0)       //base condition (if n is already 0)
        {
            return 0;
        }
        if(r==0)     //base condition(if power becomes 0 )
        {
            return 1;
        }
        return n*fun(n,r-1)%1000000007;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and its reverse ");
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(fun(n,r));
    }
}
