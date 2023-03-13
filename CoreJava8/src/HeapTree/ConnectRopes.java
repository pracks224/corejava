package HeapTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        ls.add(4);
        ls.add(3);
        ls.add(2);
        ls.add(6);
        int sum = solve(ls);
        System.out.println(sum);

    }

    public static int solve(ArrayList<Integer> A) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.addAll(A);
        int min_cost = 0;
        while (q.size()>1) {
            int first = q.poll();
            int second = q.poll();
            min_cost += first + second;
            //This step is important
            q.add(first + second);
        }
        return min_cost;
    }
}
