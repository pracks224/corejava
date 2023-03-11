package JumpGame;

public class JumpGameOne {
    //Valley Peak Approach
    public static void main(String[] args) {
        int[] nums = {1,1,1,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReachIndex = 0;//1
        for (int i = 0; i < n; i++) {
            if (maxReachIndex < i) {
                return false;
            }
            maxReachIndex = Math.max(maxReachIndex, i + nums[i]);
        }
        return true;
    }
}
