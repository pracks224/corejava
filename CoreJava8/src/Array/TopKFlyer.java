package Array;

import java.util.*;

public class TopKFlyer {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 4, 4, 4};
        int k = 2;
        int[] result = topFlyer(nums, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] topFlyer(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.merge(num, 1, Integer::sum);
        PriorityQueue<T> queue = new PriorityQueue<>((a, b) -> a.freq - b.freq);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            queue.offer(new T(num, freq));
            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().num;
        }

        return result;
    }
}

class T {
    public int num;
    public int freq;

    public T(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}
