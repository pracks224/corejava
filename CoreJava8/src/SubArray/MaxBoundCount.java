package SubArray;

import java.util.Random;

public class MaxBoundCount {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 5,6,7,2,4,5};
        int minK = 2;
        int maxK = 7;
        System.out.println(countSubarrays(nums, 2, 5));
    }

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int j = -1;
        int prevMinKIndex = -1;
        int prevMaxKIndex = -1;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < minK || nums[i] > maxK)
                j = i;
            if (nums[i] == minK)
                prevMinKIndex = i;
            if (nums[i] == maxK)
                prevMaxKIndex = i;
            // any index k in [j + 1, min(prevMinKIndex, prevMaxKIndex)] can be the
            // start of the subarray s.t. nums[k..i] satisfies the conditions
            System.out.println(Math.min(prevMinKIndex, prevMaxKIndex)+"::::::::::"+(Math.min(prevMinKIndex, prevMaxKIndex) - j));
            ans += Math.max(0, Math.min(prevMinKIndex, prevMaxKIndex) - j);

        }

        return ans;
    }
}
