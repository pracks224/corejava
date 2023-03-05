package com.leetcode.easy;

import java.util.Arrays;

public class remove_dups_sorted_array {
    public static void main(String[] args) {
        int[] nums      = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        if(nums.length == 0 || nums.length == 1)
            return 1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length-1];
        //System.out.println(Arrays.toString(nums));
        return j;
    }
}
