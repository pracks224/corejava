package Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3,0,0,0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int first = 0, second = 0;
        int k = 0;
        while (first < m && second < n) {
            if (nums1[first] >= nums2[second]) {
                merged[k++] = nums2[second++];
            } else {
                merged[k++] = nums1[first++];
            }
        }
        while (first < m) {
            if (nums1[first] > merged[k])
                merged[k++] = nums1[first++];
        }
        while (second < n) {
            if (nums2[second] > merged[k])
                merged[k++] = nums2[second++];
        }

      //  nums1 = new int[merged.length];
    //    nums1 = merged;
        System.out.println(Arrays.toString(merged));
    }
}
