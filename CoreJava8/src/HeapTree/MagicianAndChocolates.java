package HeapTree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MagicianAndChocolates {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
//        ls.add(2);
//        ls.add(4);
//        ls.add(6);
//        ls.add(8);
//        ls.add(10);
        ls.add(6);ls.add(5);
        int maxChocs = nchoc(3, ls);
        System.out.println(maxChocs);
    }

    public static int nchoc(int A, ArrayList<Integer> B) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b-a);
        q.addAll(B);
        int maxChoclates = 0;
        while (A > 0 && q.size() > 1) {
            int num = q.poll();
            maxChoclates += num;
            A--;
            int floor = (int) Math.floor(num / 2);
            q.add(floor);
        }
        return maxChoclates;
    }

}
