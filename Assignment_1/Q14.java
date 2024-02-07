package DAY_8.Assignment_1;

import java.util.ListIterator;
import java.util.Stack;
public class Q14
{
    static void sortedInsert(Stack<Integer> s, int x)
    {
        // Base case:
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }

        // If top is greater, remove the top item
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }
//For Sorting
    static void sortStack(Stack<Integer> s)
    {
        // If stack is not empty
        if (!s.isEmpty()) {
            // Remove the top item
            int x = s.pop();

            // Sort remaining stack
            sortStack(s);

            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }

//For Printing
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        // forwarding
        while (lt.hasNext())
            lt.next();

        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(8);
        s.push(9);
        s.push(0);
        s.push(5);
        System.out.println("Stack elements before sorting: ");
        printStack(s);
        sortStack(s);
        System.out.println();
        System.out.println("Stack elements after sorting:");
        printStack(s);
    }
}
