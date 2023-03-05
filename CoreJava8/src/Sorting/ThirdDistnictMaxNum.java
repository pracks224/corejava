package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class ThirdDistnictMaxNum {
    public static void main(String[] args) {
        int nums[] = {1,2};
        int result = thirdMax(nums);
        System.out.println(result);
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int current = nums[nums.length - 1];
        int k = 2;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        for (int i = nums.length - 1; i >=0; i--) {
            if (current > nums[i]) {
                current = nums[i];
                k--;
            }
            if (k == 0) break;
        }
        if (k == 0)
            return current;
        else
            return nums[nums.length - 1];
    }
}
