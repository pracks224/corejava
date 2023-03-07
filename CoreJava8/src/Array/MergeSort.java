package Array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int[] nums, int start, int end) {
        if (start >= end) return;
        int middle = start + (end - start) / 2;
        divide(nums, start, middle);
        divide(nums, middle+1, end);
        conquer(nums, start, middle, end);
    }

    public static void conquer(int[] nums, int start, int middle, int end) {
        int[] merged = new int[end - start + 1];
        int idx1 = start;
        int idx2 = middle + 1;
        int x = 0;
        while (idx1 <= middle && idx2 <= end) {
            if (nums[idx1] <= nums[idx2])
                merged[x++] = nums[idx1++];
            else
                merged[x++] = nums[idx2++];
        }
        while (idx1 <= middle) {
            merged[x++] = nums[idx1++];
        }
        while (idx2 <= end) {
            merged[x++] = nums[idx2++];
        }

     for(int i =0,j=start;i<merged.length;i++,j++){
          nums[j] = merged[i];
      }

    }
}
