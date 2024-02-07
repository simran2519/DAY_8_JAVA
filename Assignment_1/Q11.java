
package DAY_8.Assignment_1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q11
{
        static Queue<Integer> queue;
        // Recursive function to reverse the queue
        static Queue<Integer> reverseQueue(Queue<Integer> q)
        {
            // Base case
            if (q.isEmpty())
                return q;

            // Remove current item from front
            int data = q.peek();
            q.remove();

            // Reverse remaining queue
            q = reverseQueue(q);

            // Add current item to the rear
            q.add(data);

            return q;
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            queue = new LinkedList<Integer>();

            queue.add(0);
            queue.add(14);
            queue.add(5);
            queue.add(4);
            queue.add(6);
            queue = reverseQueue(queue);
            System.out.println(queue);

        }
}
