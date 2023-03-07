package Sorting;

import java.util.Arrays;

public class MinSum4Digit {
    public static void main(String[] args) {
        int num = 2932;
        System.out.println(minimumSum(num));
    }

    public static int minimumSum(int num) {
       /* int[] nums = new int[4];
        int i = 0;
        while (num > 0) {
            int remainder = num % 10;
            nums[i++] = remainder;
            num = num / 10;
        }
        Arrays.sort(nums);
        int sum = 0;
        if ((nums[0] == nums[1]) || (nums[2] == nums[3]) || nums[1]>nums[2]) {
            int temp = nums[1];
            nums[1] = nums[2];
            nums[2] = temp;
        }
        return (nums[0] * 10 + nums[1]) + (nums[2] * 10 + nums[3]);*/

        /* cleaner code */
        int[] dig = new int[4]; // For each digit
        int cur = 0;
        while(num > 0) // Getting each digit
        {
            dig[cur++] = num % 10;
            num /= 10;
        }
        Arrays.sort(dig); // Ascending order
        int num1 = dig[0] * 10 + dig[2]; // 1st and 3rd digit
        int num2 = dig[1] * 10 + dig[3]; // 2nd and 4th digit
        return num1 + num2;
    }
}
