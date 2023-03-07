package Array;

public class MajorityElelemnt {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int majorityEle = nums[0];
        for (int i = 1; i <= nums.length-1; i++) {
            if (nums[i] == majorityEle)
                count++;
            else
                count--;
            if (count == 0)
                majorityEle = nums[i];

        }
        return majorityEle;
    }
}
