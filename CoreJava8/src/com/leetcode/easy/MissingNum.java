package com.leetcode.easy;
//LeetCode - 136 -> Single number
public class MissingNum {
    public static void main(String[] args) {

    }
  //Single number elegant approach using XOR - Where we can apply XOR https://www.youtube.com/watch?v=5ATrVxnxINE
   static int singleNumber(int A[], int n) {
        int result = 0;
        for (int i = 0; i<n; i++)
        {
            result ^=A[i];
        }
        return result;
    }
    //your way initially - naive
   /* public int singleNumber(int[] nums) {
        if(nums.length ==1) return nums[0];
        Arrays.sort(nums);
        int temp =nums[nums.length-1];
        for(int i =0;i<nums.length-1;i=i+2){
            if(nums[i] !=nums[i+1]){
                temp= nums[i];
                break;
            }
        }
        return temp;
    }*/
}
