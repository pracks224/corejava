package Array;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max_sum = Math.max(sum, max_sum);
            if(sum<=0){
                sum = 0;
            }
        }
        return max_sum;
    }

    //Using divide and conquer
/*    public int maxSubArray(int[] nums) {
        return findMaxSum(nums, 0, nums.length - 1);
    }

    private int findMaxSum(int[] nums, int s, int e) {
        if (s == e) return nums[s];

        int mid = s + (e - s) / 2;

        int leftMax = findMaxSum(nums, s, mid);
        int rightMax = findMaxSum(nums, mid + 1, e);
        int arrMax = findMaxCrossSum(nums, s, mid, e);


        return Math.max(leftMax, Math.max(rightMax, arrMax));
    }

    private int findMaxCrossSum(int[] nums, int s, int m, int e) {

        int lSum = 0, lMax = Integer.MIN_VALUE;

        for (int i = m; i >= s; i--) {
            lSum += nums[i];
            lMax = Math.max(lMax, lSum);
        }

        int rSum = 0, rMax = Integer.MIN_VALUE;

        for (int i = m + 1; i <= e; i++) {
            rSum += nums[i];
            rMax = Math.max(rMax, rSum);
        }

        return lMax + rMax;
    }*/
}
