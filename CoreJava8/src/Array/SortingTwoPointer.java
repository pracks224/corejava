package Array;

import java.util.Arrays;

// Square the array and sort it ,It may have negetive numbers
public class SortingTwoPointer {
    public static void main(String[] args) {
      int[] nums ={-4,-1,0,3,10};
      int[] res = sorting(nums);
      System.out.println(Arrays.toString(res));
    }
    public static int[] sorting(int[] nums){

        int[] result =new int[nums.length];
        int i =0,j=nums.length-1;
        for(int p=0;p<nums.length;p++){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                result[p] = nums[i] * nums[i];
                i++;
            }else{
                result[p] = nums[j]*nums[j];
                j--;
            }
        }
        return result;

    }
}
