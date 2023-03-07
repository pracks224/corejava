package com.leetcode.easy;

public class remove_dups_sorted_arry_2 {
    public static void main(String[] args) {
       int[] nums = {0,1,1,1,1,2,3,3};
      //  int[] nums = {1,1,1};
        System.out.println(removeDuplicates(nums));
    }

    public  static int removeDuplicates(int[] A) {
        int i = 2;
        for (int j = 2; j < A.length; j++)
            if (A[j] != A[i-2])
                A[i++] = A[j];
        return i;
    }

    /*public static int removeSecondDups(int[] nums) {
        int j = 0;
        if (nums.length == 1 || nums.length == 0) return nums.length;
        int flagCnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]){
                if(flagCnt<=1)
                   nums[j++] = nums[i];
                flagCnt = 0;
            }
            if (nums[i] == nums[i + 1]){
                if(flagCnt<=1)
                  nums[j++] = nums[i];
                flagCnt++;
            }
        }
       // if(j>1 && nums[j-2] != nums[nums.length-1])
           if(flagCnt<=1)
             nums[j++] = nums[nums.length-1];
        System.out.println(Arrays.toString(nums));
        return j;
    }*/
}
