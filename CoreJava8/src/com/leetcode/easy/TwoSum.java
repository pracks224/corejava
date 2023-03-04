package com.leetcode.easy;

import java.util.Arrays;

/*Input: nums = [7,2,13,11], target = 9
        Output: [0,1]
        Example 2:

        Input: nums = [7,3,5], target = 8
        Output: [1,2]*/
public class TwoSum {
    public static void main(String[] args) {
        int[] input = {3,3};
        int target = 6;
        int[] resultArr = twoSum(input,target);
        System.out.println(Arrays.toString(resultArr));
    }
//force approach
    public static int[] twoSum(int[] nums, int target) {
        int[] targetArr = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    targetArr[0] = i;
                    targetArr[1] = j;
                    break;
                }
            }
        }
        return targetArr;
    }
    //linear approach
    //Another approach would be using hash map ,put the visited indices and value as key n val
    //check the target - array[current] and check in hashmap
}
